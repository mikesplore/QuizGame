package com.mike.quizgame

// GameData.kt
data class Question(
    val question: String,
    val answers: List<String>,
    val correctAnswer: String
)

val questions = listOf(
    Question(
        question = "What is the capital of France?",
        answers = listOf("London", "Paris", "Berlin", "Rome"),
        correctAnswer = "Paris"
    ),
    Question(
        question = "Which planet is known as the Red Planet?",
        answers = listOf("Earth", "Mars", "Jupiter", "Venus"),
        correctAnswer = "Mars"
    ),
    Question(
        question = "What is the largest mammal in the world?",
        answers = listOf("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"),
        correctAnswer = "Blue Whale"
    )
)
