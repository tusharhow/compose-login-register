package com.example.auth_jetpack_compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun  myOutlinedButton(Label: String,
                      Img: Int ,

                      ) {

    OutlinedButton(onClick = { }, modifier = Modifier.height(40.dp).width(350.dp)) {

        Image(

            painter = painterResource(Img),
            contentDescription = "",


            )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(Label,fontSize = 15.sp)
    }


}