package br.com.renanalencar.signalmeter.ui.viewmodel

import android.app.Application
import android.content.pm.PackageManager
import android.telephony.CellInfoLte
import android.telephony.SignalStrength
import android.telephony.TelephonyCallback
import android.telephony.TelephonyManager
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.core.app.ActivityCompat
import androidx.lifecycle.AndroidViewModel

data class SignalInfo(
    val level: Int? = null,
    val rsrp: Int? = null,
    val rsrq: Int? = null,
    val rssi: Int? = null,
)

class SignalInfoViewModel(
    application: Application,
) : AndroidViewModel(application) {
    val signalInfo = mutableStateOf(SignalInfo())

    private val telephonyManager =
        application.getSystemService(TelephonyManager::class.java)

    private val telephonyCallback =
        object :
            TelephonyCallback(),
            TelephonyCallback.SignalStrengthsListener {
            override fun onSignalStrengthsChanged(signalStrength: SignalStrength) {
                val level = signalStrength.level
                updateSignalDetails(level = level)
            }
        }

    fun startListening() {
        val context = getApplication<Application>()
        if (
            ActivityCompat.checkSelfPermission(
                context,
                android.Manifest.permission.READ_PHONE_STATE,
            ) != PackageManager.PERMISSION_GRANTED ||
            ActivityCompat.checkSelfPermission(context, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
            PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        telephonyManager.registerTelephonyCallback(
            context.mainExecutor,
            telephonyCallback,
        )

        val cellInfoList = telephonyManager.allCellInfo
        for (cellInfo in cellInfoList) {
            if (cellInfo is CellInfoLte && cellInfo.isRegistered) {
                val strength = cellInfo.cellSignalStrength
                updateSignalDetails(rsrp = strength.rsrp, rsrq = strength.rsrq, rssi = strength.rssi)
            }
        }
    }

    private fun updateSignalDetails(
        level: Int? = null,
        rsrp: Int? = null,
        rsrq: Int? = null,
        rssi: Int? = null,
    ) {
        Log.i(
            "SignalInfoViewModel",
            "PREV\tLevel: ${signalInfo.value.level}\tRSRP: ${signalInfo.value.rsrp}\tRSRQ: ${signalInfo.value.rsrq}\tRSSI: ${signalInfo.value.rssi}",
        )
        Log.i("SignalInfoViewModel", "CURR\tLevel: $level\tRSRP: $rsrp\tRSRQ: $rsrq\tRSSI: $rssi")
        signalInfo.value =
            SignalInfo(
                level = level ?: signalInfo.value.level,
                rsrp = rsrp ?: signalInfo.value.rsrp,
                rsrq = rsrq ?: signalInfo.value.rsrq,
                rssi = rssi ?: signalInfo.value.rssi,
            )
    }
}
