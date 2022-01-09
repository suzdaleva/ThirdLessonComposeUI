package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextScreen(
    modifier: Modifier =Modifier
){  Column(modifier = Modifier.fillMaxSize()){
    Header(modifier = Modifier.fillMaxWidth())
    Branding()
    SignInCreateId(modifier = Modifier.padding(horizontal = 30.dp))
    Spacer(modifier = Modifier.height(30.dp))
    Footer()
}
}