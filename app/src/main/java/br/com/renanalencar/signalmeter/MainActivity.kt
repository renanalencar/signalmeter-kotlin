package br.com.renanalencar.signalmeter

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import br.com.renanalencar.signalmeter.ui.screen.SignalInfoScreen
import br.com.renanalencar.signalmeter.ui.theme.SignalMeterTheme
import br.com.renanalencar.signalmeter.ui.viewmodel.SignalInfoViewModel

class MainActivity : ComponentActivity() {
    private val signalInfoViewModel: SignalInfoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val permissionLauncher =
            registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
                val granted = permissions.values.all { it }
                if (granted) {
                    signalInfoViewModel.startListening()
                }
            }

        val permissionsToRequest =
            arrayOf(
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.ACCESS_FINE_LOCATION,
            )

        if (permissionsToRequest.all {
                ContextCompat.checkSelfPermission(this, it) == PackageManager.PERMISSION_GRANTED
            }
        ) {
            signalInfoViewModel.startListening()
        } else {
            permissionLauncher.launch(permissionsToRequest)
        }

        setContent {
            SignalMeterTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SignalInfoScreen(viewModel = signalInfoViewModel)
                }
            }
        }
    }
}
