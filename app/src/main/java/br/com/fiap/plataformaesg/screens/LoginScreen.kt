package br.com.fiap.plataformaesg.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.plataformaesg.R

@Composable
fun LoginScreen(){

    var id = remember {
        mutableStateOf("")
    }

    var senha = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                //.height(160.dp)
            ){
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "imagem principal",
                    modifier = Modifier.size(305.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Acesse sua conta",
                    color = colorResource(id = R.color.cor_do_texto),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                )


                Spacer(modifier = Modifier.height(40.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .height(62.dp)
                            .width(297.dp),
                        placeholder = {
                            Text(text = "ID do colaborador")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.cor_da_borda),
                            ),
                       shape = RoundedCornerShape(30.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )

                Spacer(modifier = Modifier.height(17.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .height(62.dp)
                        .width(297.dp),
                    placeholder = {
                        Text(text = "Senha do colaborador")

                    },
                    colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(id = R.color.cor_da_borda),
                    ),
                   shape = RoundedCornerShape(30.dp),
                   keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Spacer(modifier = Modifier.height(49.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(62.dp)
                        .width(297.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.cor_do_botao))
                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    ) }
            }
        }
    }
}


