package com.example.lancador_de_dados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lancador_de_dados.ui.theme.Lancador_de_dadosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lancador_de_dadosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    DadoComImagemBotao()
}

@Composable //serve para exibir algo ao usuário
fun DadoComImagemBotao(modifier: Modifier = Modifier
    .fillMaxSize()
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text("Image")
            Button(onClick = {/*A fazer*/}) {
                Text(stringResource(R.string.lancar))
            }
        }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    App()
}

@Preview()
@Composable
fun AppPreview2() {
    App()
}