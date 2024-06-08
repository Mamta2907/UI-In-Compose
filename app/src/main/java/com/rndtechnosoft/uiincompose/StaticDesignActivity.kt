package com.rndtechnosoft.uiincompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rndtechnosoft.uiincompose.ui.theme.UiInComposeTheme

class StaticDesignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiInComposeTheme {
                // A surface container using the 'background' color from the theme
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )*/
                Weather()

            }
        }
    }
}


@Composable
fun Weather() {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Cyan)
        .height(60.dp)
    ) {
        Text(
            text = "Weather App",
            fontWeight = FontWeight.Bold,
            color = Color.White,

        )
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp,70.dp,0.dp,0.dp)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {


        Text(
            text = "India",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Saturday 15:06",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(0.dp, 15.dp, 0.dp, 0.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.sunlogo),
            contentDescription = "Sun Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(0.dp, 30.dp, 0.dp, 0.dp)
        )


        Text(
            text = "24°C",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )

        Text(text = "Sunny")

        Box(
            modifier = Modifier
                .padding(8.dp)
                .background(color = Color.LightGray, shape = RoundedCornerShape(10.dp))
                .padding(30.dp),

            )
        {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),

                ) {

                //sunrise
                Column(
                    modifier = Modifier.padding(0.dp, 1.dp, 0.dp, 0.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_wb_sunny_24),
                        contentDescription = "Sun",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Sunrise")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "6.00")

                }
                //Wind
                Column(
                    modifier = Modifier.padding(0.dp, 1.dp, 0.dp, 0.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_air_24),
                        contentDescription = "Air",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Wind")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "2m/s")

                }

                //Tempreature
                Column(
                    modifier = Modifier.padding(0.dp, 1.dp, 0.dp, 0.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_thermostat_24),
                        contentDescription = "Temperature",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Temperature")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "28°")

                }


            } // Row

        }
    }

}

@Preview(showBackground = true)
@Composable
fun WeatherPreview() {
    UiInComposeTheme {
        Weather()
    }
}