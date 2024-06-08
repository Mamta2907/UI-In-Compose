package com.rndtechnosoft.uiincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.Path

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.rndtechnosoft.uiincompose.ui.theme.UiInComposeTheme

import kotlin.io.path.moveTo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiInComposeTheme {
                // A surface container using the 'background' color from the them
                ListListScopeSample()
            }
        }
    }
}


@Composable
fun ListListScopeSample() {
    LazyColumn {
        item { 
            Text(text = "Header")
        }
        
        items(3) {
            Text(text = "First List items: $it")
        }
        
        items(2){
            Text(text = "Second List items: $it")
        }
    }
}

class TriangleShape:Shape{
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = androidx.compose.ui.graphics.Path().apply {
            moveTo(size.width/2,0f)
            lineTo(size.width,size.height)
            lineTo(0f,size.height)
            close()
        }
        return Outline.Generic(path)
    }

}

@Composable
fun CustomShapeExample() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color = Color.Yellow, shape = TriangleShape())
    )
}