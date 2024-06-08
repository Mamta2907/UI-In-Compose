package com.rndtechnosoft.uiincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.rndtechnosoft.uiincompose.ui.theme.UiInComposeTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginUser()
                    //CustomShapeExample()
                }
            }
        }
    }
}

@Composable
fun LoginUser() {

    //val state = remember {

    //}

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        Box(modifier = Modifier.fillMaxWidth()) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
               // HalfRoundedCornerShapeExample()
                Image(painter = painterResource(id = R.drawable.shape_custome), contentDescription = "my shape")
                Image(
                    painter = painterResource(id = R.drawable.login_story),
                    contentDescription = "Login Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(50.dp)
                )
            }
        }

        //TextField(value = , onValueChange = )


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UiInComposeTheme {
        LoginUser()
    }
}

@Composable
fun RoundedCornerShapeExample() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(
                color = Color.Blue,
                shape = RoundedCornerShape(16.dp)
            )
    )
}

@Composable
fun CircleShapeExample() {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(
                color = Color.Green,
                shape = CircleShape
            )
    )
}

@Composable
fun CutCornerShapeExample() {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(
                color = Color.Red,
                shape = CutCornerShape(15.dp)
            )
    )
}


@Composable
fun HalfRoundedCornerShapeExample() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp) // Ensure the Canvas has a height
    ) {
        drawRoundRect(
            color = Color.Blue,
            size = Size(size.width, size.height / 2),
            cornerRadius = CornerRadius(16.dp.toPx(), 16.dp.toPx())
        )
    }
}
