package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.thirdlessoncomposeui.R
import com.myapp.thirdlessoncomposeui.ui.theme.ThirdLessonComposeUITheme

@Composable
fun Socials(modifier : Modifier = Modifier) {
    Row(modifier = modifier) {
        CircleButton(painter = painterResource(id =  R.drawable.ic_vk))
        Spacer(modifier = Modifier.width(10.dp))
        CircleButton(painter = painterResource(id =  R.drawable.ic_fb))
        Spacer(modifier = Modifier.width(10.dp))
        CircleButton(painter = painterResource(id =  R.drawable.ic_google))
        Spacer(modifier = Modifier.width(10.dp))
        Image(
            painter = painterResource(id =  R.drawable.ic_qr),
            modifier = modifier.align(Alignment.CenterVertically).size(30.dp, 30.dp),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "QR-код",
            modifier = modifier.align(Alignment.CenterVertically),
            style = MaterialTheme.typography.subtitle2
        )
        Spacer(modifier = Modifier.width(10.dp))
        CircleButton(painter = painterResource(id =  R.drawable.ic_more))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewForSocials() {
    ThirdLessonComposeUITheme {
        Socials()
    }
}