package com.myapp.thirdlessoncomposeui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.thirdlessoncomposeui.R
import com.myapp.thirdlessoncomposeui.ui.theme.ThirdLessonComposeUITheme

@Composable
fun Footer(modifier : Modifier = Modifier.fillMaxWidth(), alignment: Alignment.Horizontal = Alignment.CenterHorizontally)
{

    Column(
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = stringResource(id = R.string.enter_with),
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                fontSize = 16.sp,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Socials(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = stringResource(id = R.string.yandex_id_is_key),
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray,
                fontSize = 18.sp,
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = stringResource(id = R.string.discover_more),
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 18.sp,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewFooter() {
    ThirdLessonComposeUITheme {
        Footer()
    }
}