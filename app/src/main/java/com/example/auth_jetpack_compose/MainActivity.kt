package com.example.auth_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.auth_jetpack_compose.navigations.setupNavGraph
import com.example.auth_jetpack_compose.ui.theme.Auth_jetpack_composeTheme

class MainActivity  : ComponentActivity() {
   private lateinit var  navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
    Auth_jetpack_composeTheme {
        Surface {
            navController = rememberNavController()
            setupNavGraph(navController)
        }
        }
    }

    }

}