package com.example.auth_jetpack_compose.navigations

sealed class Screen(val route : String) {
    object Login : Screen(route = "login")
    object Register : Screen( route = "register")
}
