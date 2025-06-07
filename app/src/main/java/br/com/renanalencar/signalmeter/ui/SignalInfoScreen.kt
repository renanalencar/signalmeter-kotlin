package br.com.renanalencar.signalmeter.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import br.com.renanalencar.signalmeter.SignalInfoViewModel

@Composable
fun SignalInfoScreen(viewModel: SignalInfoViewModel) {
    val signal by viewModel.signalInfo

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =
            Modifier
                .verticalScroll(rememberScrollState())
                .windowInsetsPadding(
                    androidx.compose.foundation.layout.WindowInsets.systemBars,
                ).windowInsetsPadding(
                    androidx.compose.foundation.layout.WindowInsets.navigationBars,
                ),
    ) {
        Card(
            modifier =
                Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
        ) {
            Column(
                modifier =
                    Modifier.Companion
                        .fillMaxSize()
                        .padding(24.dp),
            ) {
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(
                        "Signal Length Level: ${signal.level ?: "Unknown"}",
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(modifier = Modifier.Companion.height(16.dp))
                Text(
                    "RSRP: ${signal.rsrp ?: "Unknown"} dBm",
                    style = MaterialTheme.typography.bodyLarge,
                )
                Text(
                    "RSRQ: ${signal.rsrq ?: "Unknown"} dB",
                    style = MaterialTheme.typography.bodyLarge,
                )
                Text(
                    "RSSI: ${signal.rssi ?: "Unknown"} dBm",
                    style = MaterialTheme.typography.bodyLarge,
                )
            }
        }
    }
}
