package com.mike.quizgame

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val brush = Brush.verticalGradient(
    colors = listOf(
        Color(0xffF8C794),
        Color(0xffFFE0B5),
        )
)

@Composable
fun GameScreen() {
    val score = remember { mutableStateOf(0) }
    val questionsize = questions.size
    val currentQuestionIndex = remember { mutableStateOf(0) }
    val shuffledQuestions = remember { questions.shuffled() }

    val currentQuestion = questions.getOrElse(currentQuestionIndex.value % questions.size) { questions.last() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(modifier = Modifier
                .height(50.dp)
                .width(120.dp)
                .background(Color(0xffBA704F), shape = RoundedCornerShape(20.dp),),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text(
                    text = "${score.value}",
                    fontSize = 30.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center,

                    )
            }
        }
        Column(
            modifier = Modifier
                .absolutePadding(0.dp,200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .width(300.dp)
                    .height(200.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = currentQuestion.question,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 16.dp),
                    lineHeight = 50.sp
                )
            }

            val pairs = currentQuestion.answers.chunked(2)
            pairs.forEach { pair ->
                Row(
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    pair.forEach { answer ->
                        Button(
                            onClick = {
                                if (answer == currentQuestion.correctAnswer) {
                                    score.value += 10
                                }
                                currentQuestionIndex.value++
                            },
                            modifier = Modifier
                                .padding(5.dp)
                                .width(150.dp),
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xff3C2A21))
                        ) {
                            Text(
                                text = answer,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White,
                            )
                        }
                    }
                }

            }
        }

        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    score.value = 0
                    currentQuestionIndex.value++
                },
                modifier = Modifier.width(150.dp),
                colors = ButtonDefaults.buttonColors(Color(0xff6C3428)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "Restart",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White,
                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(150.dp),
                colors = ButtonDefaults.buttonColors(Color(0xff6C3428)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "End",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White,
                )
            }
        }
    }
}







@Preview
@Composable
fun GameScreenPreview(){
    GameScreen()

}