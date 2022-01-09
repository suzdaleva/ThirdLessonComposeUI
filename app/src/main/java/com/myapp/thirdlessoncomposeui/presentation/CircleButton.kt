package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myapp.thirdlessoncomposeui.R
import com.myapp.thirdlessoncomposeui.ui.theme.ThirdLessonComposeUITheme
import kotlinx.coroutines.launch


@Composable
fun CircleButton(modifier: Modifier = Modifier, painter : Painter = painterResource(id =  R.drawable.ic_google)) {

        Box(
            modifier = modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.White)
                .border(
                    width = 2.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                )
                .clickable {
                }
        ) {
            Image(
                painter = painter,
                modifier = modifier.align(Alignment.Center).size(30.dp, 30.dp),
                contentDescription = null
            )
        }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewCircleButton() {
    ThirdLessonComposeUITheme {
        CircleButton()
    }
}