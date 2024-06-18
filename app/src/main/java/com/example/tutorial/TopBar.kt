package com.example.tutorial

import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial.ui.theme.Green
import com.example.tutorial.ui.theme.TutorialTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text(text = "What's App") },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context,"whatsApp", Toast.LENGTH_SHORT).show()}) {
                Icon(painter = painterResource(id = R.drawable.whatsapp), contentDescription ="whatsapp" )

            }
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Green,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ), actions =
        {
            IconButton(onClick = { Toast.makeText(context,"Profile", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.Person, contentDescription ="profile", tint = Color.White)

            }
            IconButton(onClick = { Toast.makeText(context,"Search", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription ="search", tint = Color.White)

            }
            IconButton(onClick = { Toast.makeText(context,"More", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription ="more", tint = Color.White)

            }
        }
    )
}

@Preview
@Composable
fun TopAppBarPreview(){
    TutorialTheme {
        TopBar()
    }
}