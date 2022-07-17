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
import androidx.navigation.compose.rememberNavController
import com.example.auth_jetpack_compose.R
import com.example.auth_jetpack_compose.components.myOutlinedButton


@Composable
fun signupScreen(navController: NavHostController) {

    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
val navController = rememberNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Image(

            painter = painterResource(R.drawable.signup),
            contentDescription = "",
            modifier =  Modifier.height(200.dp)

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
                Text(text = "Email")
            },
            placeholder = {
                Text(text = "Enter email")
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
            onClick = {  },
            modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
                .height(50.dp),
        ) {
            Text(text = "Sign Up", style =  TextStyle(fontSize =  15.sp))
        }
        Spacer(modifier = Modifier.height(25.dp))
        Row  (   horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            Text(text = "Already have an account?", style = TextStyle(fontSize = 15.sp))
            Spacer(modifier = Modifier.width(3.dp))
            TextButton(
                onClick = {
                    navController.navigate("log")
                },


            ) {
                Text(text = "Login")
            }
        }
        // social media login
        Spacer(modifier = Modifier.height(25.dp))
        myOutlinedButton(Label =  "Signup with Facebook", Img =(R.drawable.facebook) )
        Spacer(modifier = Modifier.height(8.dp))
        myOutlinedButton(Label =  "Signup with Google", Img =(R.drawable.google) )
    }

}