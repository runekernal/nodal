package com.runekernal.nodal.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.DeviceFontFamilyName
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.runekernal.nodal.R

@Composable
fun StartingScreen(name: String, modifier: Modifier = Modifier) {
    val fontFamily = FontFamily(Font(DeviceFontFamilyName("Roboto")))
    val fontSize = TextUnit(96f, TextUnitType.Sp)
    val materialColor = androidx.compose.material3.MaterialTheme.colorScheme.primary
    val image = painterResource(R.drawable.background)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            alpha = 0.5F,
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(32.dp, 104.dp)
        ) {
            Text(
                text = "Hello,",
                fontFamily = fontFamily,
                fontSize = fontSize,
                fontWeight = FontWeight(500)
            )
            Text(
                text = name,
                fontFamily = fontFamily,
                fontSize = fontSize,
                color = materialColor,
                fontWeight = FontWeight.Bold
            )

        }
        Button(onClick = {

        }, modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)) {
            Text(
                text = "Next",
                fontFamily = fontFamily,
                fontSize = TextUnit(18f, TextUnitType.Sp),
                color = androidx.compose.material3.MaterialTheme.colorScheme.background,
            )
        }
    }
}


