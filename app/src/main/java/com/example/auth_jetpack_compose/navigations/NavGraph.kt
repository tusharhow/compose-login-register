package com.example.auth_jetpack_compose.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.auth_jetpack_compose.auth.loginScreen
import com.example.auth_jetpack_compose.auth.signupScreen

@Composable
fun setupNavGraph(navController: NavHostController) {
NavHost(navController, startDestination =  Screen.Login.route) {
    composable(Screen.Login.route) { loginScreen(navController) }
    composable(Screen.Register.route) { signupScreen(navController) }
}
}