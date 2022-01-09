package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*


import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.sp
import com.myapp.thirdlessoncomposeui.ui.theme.ThirdLessonComposeUITheme



@Composable
fun SimpleTextInputComponent() {

        var textValue by remember { mutableStateOf(TextFieldValue("Телефон или почта                                     ")) }
        Box(modifier = Modifier.background(
            color = Color.White
        ).fillMaxWidth()) {
            BasicTextField(
                modifier = Modifier.fillMaxWidth(),
                value = textValue,
                onValueChange = { textValue = it },
            textStyle = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textDecoration = TextDecoration.Underline,
                color = Color.LightGray,
            )
            )
        }
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreviewFor() {
    ThirdLessonComposeUITheme {
        SimpleTextInputComponent()
    }
}



