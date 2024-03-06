package br.com.fiap.plataformaesg.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.plataformaesg.R

@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                //.height(160.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "imagem principal",
                    modifier = Modifier
                        .size(305.dp)
                        .padding(top = 50.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Acesse sua conta",
                    color = colorResource(id = R.color.cor_do_texto),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                )

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    singleLine = true,
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .height(62.dp)
                        .width(297.dp),
                    placeholder = {
                        Text(text = "ID do colaborador")
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.fingerprint_24),
                            contentDescription = "icone de cadeado"
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.cor_da_borda),
                    ),
                    shape = RoundedCornerShape(30.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { letra -> password = letra },
                    singleLine = true,
                    modifier = Modifier
                        .padding(top = 17.dp)
                        .height(62.dp)
                        .width(297.dp),
                    placeholder = {
                        Text(text = "Senha do colaborador")
                    },

                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.lock_24),
                            contentDescription = "icone de cadeado"
                        )
                    },

                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.cor_da_borda),
                    ),

                    shape = RoundedCornerShape(30.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 60.dp)
                        .height(62.dp)
                        .width(297.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.cor_do_botao))
                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }


            }

        }
    }
}


