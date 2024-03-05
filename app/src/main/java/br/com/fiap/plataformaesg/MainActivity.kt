package br.com.fiap.plataformaesg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.plataformaesg.screens.HomeScreen
import br.com.fiap.plataformaesg.screens.LoginScreen
import br.com.fiap.plataformaesg.ui.theme.PlataformaESGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlataformaESGTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination =  "home"){
                    composable(route="home"){
                       HomeScreen(navController = navController)
                    }
                    composable(route="login"){
                        LoginScreen()
                    }
                }
              
            }
        }
    }
}

