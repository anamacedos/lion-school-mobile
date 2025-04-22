package br.senai.sp.jandira.lionschool.screans

import android.widget.NumberPicker.OnValueChangeListener
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

fun TelaCourses(){
    Box(
        modifier = Modifier
            .background(color = Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 25.dp, end = 25.dp, top = 50.dp, bottom = 25.dp)
                .background(color = Color.White),
            horizontalAlignment = Alignment.Start
        ) {
            Row {
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
                    .padding(top = 10.dp, bottom = 30.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                label = {
                        Text(
                            text = stringResource(R.string.find_course_outlined),
                            color = Color.Gray,
                        )
                },
                trailingIcon = { //leadingIcon coloca o icon no começo, ja o trailing no final
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                },
            )
            Row (
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.list),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .size(37.dp)
                )
                Text(
                    text = stringResource(R.string.courses),
                    fontSize = 24.sp,
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 10.dp)
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xFF3347B0),
                                Color(0xFFCFD4EA)
                            )
                        )
                    )
                )
                {
                    Column() {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(R.drawable.ds),
                                contentDescription = stringResource(R.string.logo_description),
                                modifier = Modifier
                                    .size(70.dp)
                            )
                            Text(
                                text = stringResource(R.string.ds),
                                fontSize = 45.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 12.dp),
                            )
                        }

                        Text(
                            text = stringResource(R.string.desenvolvimento_de_sistemas),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.5.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 6.dp)
                        )
                        Text(
                            text = stringResource(R.string.ds_skils),
                            fontSize = 10.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 25.dp),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(R.drawable.relogio),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)
                            )
                            Text(
                                text = stringResource(R.string.tres_semestres),
                                color = Color.White,
                                fontSize = 8.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )
                        }
                    }

                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 20.dp)
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF3347B0),
                                    Color(0xFFCFD4EA)
                                )
                            )
                        )
                ){
                    Column() {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(R.drawable.ds),
                                contentDescription = stringResource(R.string.logo_description),
                                modifier = Modifier
                                    .size(70.dp)
                            )
                            Text(
                                text = stringResource(R.string.ds),
                                fontSize = 45.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 12.dp),
                            )
                        }

                        Text(
                            text = stringResource(R.string.desenvolvimento_de_sistemas),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.5.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 6.dp)
                        )
                        Text(
                            text = stringResource(R.string.ds_skils),
                            fontSize = 10.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 25.dp),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(R.drawable.relogio),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)
                            )
                            Text(
                                text = stringResource(R.string.tres_semestres),
                                color = Color.White,
                                fontSize = 8.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )
                        }
                    }
                }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 20.dp)
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF5A659F),
                                    Color(0xFF9FA9E1)
                                )
                            )
                        )
                )
                {
                    Column() {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(R.drawable.ds),
                                contentDescription = stringResource(R.string.logo_description),
                                modifier = Modifier
                                    .size(70.dp)
                            )
                            Text(
                                text = stringResource(R.string.ds),
                                fontSize = 45.sp,
                                color = Color(0xFFFFC23D),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 12.dp),
                            )
                        }

                        Text(
                            text = stringResource(R.string.desenvolvimento_de_sistemas),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.5.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 6.dp)
                        )
                        Text(
                            text = stringResource(R.string.ds_skils),
                            fontSize = 10.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(start = 20.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, top = 25.dp),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(R.drawable.relogio),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)
                            )
                            Text(
                                text = stringResource(R.string.tres_semestres),
                                color = Color.White,
                                fontSize = 8.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )
                        }
                    }
                }
            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaCoursesPreview() {
    TelaCourses()

}