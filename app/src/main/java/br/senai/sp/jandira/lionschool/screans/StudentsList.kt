package br.senai.sp.jandira.lionschool.screans

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun TelaStudentsList(){
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
            horizontalAlignment = Alignment.Start
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
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
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                )

                Card (
                    modifier = Modifier
                        .height(38.dp)
                        .width(38.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)

                    ),
                    shape = CircleShape,
                ){
                    Text(
                        text = stringResource(R.string.ds),
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(Alignment.Center),
                        color = Color(0xff3347B0),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp

                    )
                }
            }
            HorizontalDivider(
                color = Color(0xFFFFC23D),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 15.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                label = {
                    Text(
                        text = stringResource(R.string.find_student_outlined),
                        color = Color.Gray,
                    )
                },
                trailingIcon = { //leadingIcon coloca o icon no começo, ja o trailing no final
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                }
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)

            ){
                Card (
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    modifier = Modifier
                ){
                    Text(
                        text = stringResource(R.string.todos),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp, start = 8.dp, end = 8.dp),
                        color = Color(0xff3347B0),
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Card (
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                ){
                    Text(
                        text = stringResource(R.string.cursando),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp, start = 8.dp, end = 8.dp),
                        color = Color(0xff3347B0),
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Card (
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    modifier = Modifier
                ){
                    Text(
                        text = stringResource(R.string.finalizado),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp, start = 8.dp, end = 8.dp),
                        color = Color(0xff3347B0),
                        fontWeight = FontWeight.SemiBold
                    )
                }

            }
            Row (
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.capelo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .size(37.dp)

                )
                Text(
                    text = stringResource(R.string.students_list),
                    fontSize = 23.sp,
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 5.dp)
                )
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){

                Row (
                    modifier = Modifier
                        .background(color = Color.Red)
                        .fillMaxSize()
                        .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card (
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFC23D)
                        ),
                        shape = RectangleShape
                    ){}
                    Card (
                        shape = CircleShape,
                        modifier = Modifier
                            .size(60.dp)
                    ) {  }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(R.string.nome_aluno),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)

                        )
                        Text(
                            text = stringResource(R.string.matricula_aluno)
                        )
                    }
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){

            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){  }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){  }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){  }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF9FA9E1)

                )
            ){  }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaStudentsListPreview() {
    TelaStudentsList()

}