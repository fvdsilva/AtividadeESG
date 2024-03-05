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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.plataformaesg.R

@Composable
fun HomeScreen(navController: NavController){
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
               painter = painterResource(id = R.drawable.img),
               contentDescription = "imagem principal",
              modifier = Modifier.size(328.dp),
               contentScale = ContentScale.Crop
           )
           Spacer(modifier = Modifier.height(50.dp))
           Text(
               text = "Seja bem-vindo!",
               color = colorResource(id = R.color.cor_do_texto),
               fontSize = 25.sp,
               fontWeight = FontWeight.Bold,
               )

           Spacer(modifier = Modifier.padding(14.dp))
           Text(
               text = "Este app foi criado para ajudar você a " +
                       "ser mais sustentável e responsável" +
                       " em sua vida pessoal e profissional.",
               color = colorResource(id = R.color.cor_do_texto),
               fontSize = 15.sp,
               textAlign = TextAlign.Center

           )
           Spacer(modifier = Modifier.height(88.dp))
           Button(
               onClick = {
               navController.navigate( route = "login") },
               modifier = Modifier.height(62.dp).width(297.dp),
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.cor_do_botao))
           ) {
               Text(
                   text = "Comece aqui",
                   color = Color.White,
                   fontSize = 20.sp,
                   textAlign = TextAlign.Center,


               ) }
        }
          }
            }
               }



















