package br.senai.sp.jandira.lionschool.screans

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R


@Composable
fun TelaInicial(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 25.dp, end = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalArrangement = Arrangement.Center

        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(R.string.logo_description),
                modifier = Modifier
//                    .padding(top = 75.dp, start = 50.dp)
                    .size(150.dp)
            )
            Column (
                modifier = Modifier
                    .padding(top = 12.dp)
            ){
                Text(
                    text = stringResource(R.string.lion),
                    fontSize = 38.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xff3347B0)
                )
                Text(
                    text = stringResource(R.string.school),
                    fontSize = 38.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xff3347B0)
                )
            }

        }
        Text(
            text = stringResource(R.string.find_course),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 120.dp, bottom = 5.dp),
            color = Color(0xff3347B0)
        )
        Card (
            modifier = Modifier
                .width(48.dp)
                .height(6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFC23D)
            )
        ){  }
        Text(
            text = stringResource(R.string.text),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 160.dp),
            color = Color.Gray
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                          containerColor = Color(0xffFFC23D)
                        ),
            border = BorderStroke(1.2.dp, Color(0xff3347B0))
        ) {
            Text(
                text = stringResource(R.string.get_started),
                fontWeight = FontWeight.Bold,
                color = Color(0xff3347B0)
            )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(
                painter = painterResource(R.drawable.youtube),
                contentDescription = stringResource(R.string.social_media_description),
                modifier = Modifier
                    .size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.twitter),
                contentDescription = stringResource(R.string.social_media_description),
                modifier = Modifier
                    .size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.instagram),
                contentDescription = stringResource(R.string.social_media_description),
                modifier = Modifier
                    .size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = stringResource(R.string.social_media_description),
                modifier = Modifier
                    .size(35.dp)
            )
        }

    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()

}