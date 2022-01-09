package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.thirdlessoncomposeui.R
import com.myapp.thirdlessoncomposeui.ui.theme.ThirdLessonComposeUITheme

@Composable
fun SignInCreateId(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = stringResource(id = R.string.enter_id),
                style = TextStyle(
                    color = Color.LightGray,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                ),
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(top = 64.dp, bottom = 2.dp)
            )
        }

        SimpleTextInputComponent()
        ClickableText(
            text = AnnotatedString("Не помню"),
            style = TextStyle(
                color = Color.Blue,
                fontSize = 18.sp,
            ),
            onClick = {}
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp, bottom = 3.dp)
        ) {
            Text(
                color = MaterialTheme.colors.onSurface,
                text = stringResource(id = R.string.button_enter_text),
                style = MaterialTheme.typography.subtitle2
            )
        }
        OutlinedButton(
            onClick = {},
            border = BorderStroke(1.dp, Color.LightGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, bottom = 3.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Text(
                color = MaterialTheme.colors.onSurface,
                text = stringResource(id = R.string.button_create_id_text),
                style = MaterialTheme.typography.subtitle2
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThirdLessonComposeUITheme {
        SignInCreateId()
    }
}