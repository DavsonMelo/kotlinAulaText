package com.example.aula01_text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula01_text.ui.theme.Aula01_textTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextExemplos()
        }
    }
}
@Preview
@Composable
fun TextExemplos() { // Define a função composable TextExemplos.
    Column( // Cria uma coluna para organizar os componentes verticalmente
        modifier = Modifier
            .background(Color.White) // Define o fundo da coluna como branco
            .fillMaxSize() // Faz a coluna preencher todo espaço disponível
            .padding(28.dp), // Adiciona um espaçamento dentro da coluna
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = "Olá, Mundo!", // Exibe o texto Olá, Mundo!
            fontSize = 30.sp, // Define o tamanho da fonte como 30 sp
        )
        Text(
            text = "Texto colorido",
            color = Color.Green, // Define a cor do texto como verde
            fontSize = 30.sp,
        )
        Text(
            text = "Texto em negrito",
            fontWeight = FontWeight.Bold, // Define o texto com negrito
            fontSize = 30.sp,
        )
        Text(
            text = "Texto à direita",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth(), // Faz o texto ocupar toda a largura disponível
            textAlign = TextAlign.End, // Alinha o texto a direita
        )
        Text(
            text = "Texto ao centro",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth(), // Faz o texto ocupar toda a largura disponível
            textAlign = TextAlign.Center, // Alinha o texto ao centro
        )
        Text(
            text = "Texto em negrito",
            fontWeight = FontWeight.Thin, // Define o peso do texto como fino
            fontSize = 30.sp,
        )
        Text(
            text = "Texto em negrito forte",
            fontWeight = FontWeight.ExtraBold, // Define o texto com extra negrito
            fontSize = 30.sp,
        )
        Text(
            text = "Texto em itálico",
            fontStyle = FontStyle.Italic, // Define o texto com itálico
            fontSize = 30.sp,
        )
        Text(
            text = "Texto sublinhado",
            textDecoration = TextDecoration.Underline, // Define o texto com sublinhado
            fontSize = 30.sp,
        )
        Text(
            text = "Este é um texto tachado",
            textDecoration = TextDecoration.LineThrough, // Define o texto com tachado
            fontSize = 30.sp,
        )
        Text(
            text = "Espaçamento",
            letterSpacing = 10.sp, // Define o texto com negrito
            fontSize = 30.sp,
        )
        Text(
            text = "Sublinhado e taxado",
            fontSize = 30.sp,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.Underline,
                    TextDecoration.LineThrough
                ) // Combina sublinhado e taxado
            )
        )
        Text(
            text = "Texto com cor de fundo",
            fontSize = 30.sp,
            color = Color.White, // Define a cor do texto como branca
            modifier = Modifier
                .background(Color.Magenta) // Define o fundo do texto de cor magenta
        )
        Text(
            text = "Estilo de fonte personalizado",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive, // Define a fonte como cursiva
            fontWeight = FontWeight.Bold, // Define a fonte com negrito
        )
        Text(
            text = "Texto com sombra",
            style = TextStyle(
                fontSize = 30.sp,
                shadow = Shadow( // Cria uma sombra na fonte
                    color = Color.Gray, // Define a cor da sombra como cinza
                    offset = Offset(4f, 4f), // Define o deslocamento da sombra
                    blurRadius = 22f // Define o raio de desfoque da sombra
                )
            )
        )
        Text(
            text = "Sombra e colorido",
            style = TextStyle(
                fontSize = 30.sp,
                color = Color.Blue,
                shadow = Shadow( // Cria uma sombra na fonte
                    color = Color.Gray, // Define a cor da sombra como cinza
                    offset = Offset(4f, 4f), // Define o deslocamento da sombra
                    blurRadius = 22f // Define o raio de desfoque da sombra
                )
            )
        )
    }
}