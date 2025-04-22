package br.senai.sp.jandira.lionschool.screans

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun TelaStudentScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(start = 25.dp, end = 25.dp, bottom = 25.dp, top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ){
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .padding(end = 2.dp)
                )
                Column (
                    modifier = Modifier
                ){
                    Text(
                        text = stringResource(R.string.lion),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xff3347B0),
                        modifier = Modifier
                            .padding(top = 3.dp)
                    )
                    Text(
                        text = stringResource(R.string.school),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xff3347B0)
                    )
                }
            }
            HorizontalDivider(
                color = Color(0xFFFFC23D),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 25.dp)
            )

            Card(
                shape = CircleShape,
                modifier = Modifier
                    .size(150.dp),
                border = BorderStroke(
                    width = 4.dp,
                    color = Color(0xFFFFC23D)
                )
            ) {

            }
            Text(
                text = stringResource(R.string.nome_aluno),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xff3347B0),
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 5.dp)
            )
            Text(
                text = stringResource(R.string.course_description),
                fontSize = 15.sp,
                color = Color(0xff3347B0),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 25.dp, end = 25.dp, bottom = 7.dp)
            )

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xff9FA9E1)
                )
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(R.string.desempenho),
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }

        }


    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaStudentScreenPreview() {
    TelaStudentScreen()

}