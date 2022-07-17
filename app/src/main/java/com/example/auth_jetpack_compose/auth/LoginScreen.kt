package com.example.auth_jetpack_compose.auth


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth_jetpack_compose.R
import com.example.auth_jetpack_compose.components.myOutlinedButton
import com.example.auth_jetpack_compose.navigations.Screen


@Composable
    fun loginScreen(navController: NavHostController) {
    val navController = rememberNavController()
        val username = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(15.dp))
            Image(

                painter = painterResource(R.drawable.login),
                contentDescription = "",


                )
            Spacer(modifier = Modifier.height(50.dp))
            OutlinedTextField(
                value = username.value,
                onValueChange = {

                },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "Username")
                },
                placeholder = {
                    Text(text = "Enter username")
                },
                modifier = Modifier.fillMaxWidth(),
                shape =  RoundedCornerShape(10.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = password.value,
                onValueChange = {

                },
                leadingIcon = {
                    Icon(Icons.Default.Info, contentDescription = "person")
                },
                label = {
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "Enter password")
                },
                modifier = Modifier.fillMaxWidth(),
                shape =  RoundedCornerShape(10.dp)

            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = {

                },
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
                    .height(50.dp),
            ) {
                Text(text = "Login", style =  TextStyle(fontSize =  15.sp))
            }
            Spacer(modifier = Modifier.height(25.dp))
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

                    ){
                Text(text = "Don't have an account?", style = TextStyle(fontSize = 15.sp))
                Spacer(modifier = Modifier.width(3.dp))
                TextButton(
                    onClick = {
                        navController.navigate(Screen.Register.route)
                    },


                ) {
                    Text(text = "Sign up")
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            myOutlinedButton(Label =  "Login with Facebook", Img =(R.drawable.facebook) )
            Spacer(modifier = Modifier.height(8.dp))
            myOutlinedButton(Label =  "Login with Google", Img =(R.drawable.google) )


        }


    }


