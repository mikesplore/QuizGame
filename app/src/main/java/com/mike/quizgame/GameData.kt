package com.mike.quizgame

// GameData.kt
data class Question(
    val question: String,
    val answers: List<String>,
    val correctAnswer: String
)

val questions = listOf(
    Question(
        question = "What is the capital of Kenya?",
        answers = listOf("London", "Nairobi", "Paris", "Rome"),
        correctAnswer = "Nairobi"
    ),
    Question(
        question = "Which planet is known as the Red Planet?",
        answers = listOf("Earth", "Mars", "Jupiter", "Venus"),
        correctAnswer = "Mars"
    ),
    Question(
        question = "What is the largest mammal in the world?",
        answers = listOf("Elephant", "Blue Whale", "Giraffe", "Rhinno"),
        correctAnswer = "Blue Whale"
    ),
    Question(
        question = "What is the chemical symbol for gold?",
        answers = listOf("Au", "Ag", "Fe", "Cu"),
        correctAnswer = "Au"
    ),

    Question(
        question = "What is the smallest planet in our solar system?",
        answers = listOf("Mercury", "Venus", "Earth", "Mars"),
        correctAnswer = "Mercury"
    ),


    Question(
        question = "What is the smallest planet in our solar system?",
        answers = listOf("Mercury", "Venus", "Earth", "Mars"),
        correctAnswer = "Mercury"
    ),



    Question(
        question = "Which gas do plants absorb from sunlight?",
        answers = listOf("Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"),
        correctAnswer = "Carbon Dioxide"
    ),

    Question(
        question = "What is the chemical symbol for gold?",
        answers = listOf("Au", "Ag", "Fe", "Cu"),
        correctAnswer = "Au"
    ),

    Question(
        question = "Who wrote 'Romeo and Juliet'?",
        answers = listOf("William Shakespeare", "Jane Austen", "Charles Dickens", "Mark Twain"),
        correctAnswer = "William Shakespeare"
    ),
    Question(
        question = "What is the capital of France?",
        answers = listOf("Berlin", "Madrid", "Paris", "Rome"),
        correctAnswer = "Paris"
    ),
    Question(
        question = "What is the largest ocean on Earth?",
        answers = listOf("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
        correctAnswer = "Pacific Ocean"
    ),
    Question(
        question = "Which country is known as the Land of the Rising Sun?",
        answers = listOf("China", "Japan", "South Korea", "Vietnam"),
        correctAnswer = "Japan"
    ),
    Question(
        question = "Who painted the Mona Lisa?",
        answers = listOf("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"),
        correctAnswer = "Leonardo da Vinci"
    ),
    Question(
        question = "What is the largest organ in the human body?",
        answers = listOf("Heart", "Brain", "Liver", "Skin"),
        correctAnswer = "Skin"
    ),
    Question(
        question = "Who developed the theory of relativity?",
        answers = listOf("Isaac Newton", "Albert Einstein", "Stephen Hawking", "Galileo Galilei"),
        correctAnswer = "Albert Einstein"
    ),
    Question(
        question = "What is the chemical symbol for water?",
        answers = listOf("H2O", "CO2", "NaCl", "CH4"),
        correctAnswer = "H2O"
    ),
    Question(
        question = "What is the tallest mountain in the world?",
        answers = listOf("Mount Everest", "K2", "Kangchenjunga", "Lhotse"),
        correctAnswer = "Mount Everest"
    ),
    Question(
        question = "Who was the first person to step on the Moon?",
        answers = listOf("Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "Alan Shepard"),
        correctAnswer = "Neil Armstrong"
    ),
    Question(
        question = "What is the chemical symbol for iron?",
        answers = listOf("Ir", "Fe", "In", "Au"),
        correctAnswer = "Fe"
    ),
    Question(
        question = "Which planet is known as the 'Giant of the Solar System'?",
        answers = listOf("Saturn", "Jupiter", "Uranus", "Neptune"),
        correctAnswer = "Jupiter"
    ),
    Question(
        question = "What is the hardest natural substance on Earth?",
        answers = listOf("Gold", "Diamond", "Platinum", "Silver"),
        correctAnswer = "Diamond"
    ),
    Question(
        question = "Who is the author of 'The Great Gatsby'?",
        answers = listOf("F. Scott Fitzgerald", "Ernest Hemingway", "John Steinbeck", "William Faulkner"),
        correctAnswer = "F. Scott Fitzgerald"
    ),
    Question(
        question = "What is the main ingredient in guacamole?",
        answers = listOf("Tomato", "Onion", "Avocado", "Cilantro"),
        correctAnswer = "Avocado"
    ),
    Question(
        question = "Which country is famous for its tulips?",
        answers = listOf("Italy", "Netherlands", "France", "Germany"),
        correctAnswer = "Netherlands"
    ),
    Question(
        question = "Who discovered penicillin?",
        answers = listOf("Alexander Fleming", "Marie Curie", "Louis Pasteur", "Robert Koch"),
        correctAnswer = "Alexander Fleming"
    ),
    Question(
        question = "Which famous scientist developed the theory of gravity?",
        answers = listOf("Albert Einstein", "Isaac Newton", "Stephen Hawking", "Galileo Galilei"),
        correctAnswer = "Isaac Newton"
    ),
    Question(
        question = "What is the largest type of big cat in the world?",
        answers = listOf("Lion", "Leopard", "Tiger", "Jaguar"),
        correctAnswer = "Tiger"
    ),
    Question(
        question = "What is the chemical symbol for silver?",
        answers = listOf("Ag", "Si", "Sr", "S"),
        correctAnswer = "Ag"
    ),
    Question(
        question = "What is the chemical symbol for iron?",
        answers = listOf("Ir", "Fe", "In", "Au"),
        correctAnswer = "Fe"
    ),
    Question(
        question = "Which planet is known as the 'Giant of the Solar System'?",
        answers = listOf("Saturn", "Jupiter", "Uranus", "Neptune"),
        correctAnswer = "Jupiter"
    ),
    Question(
        question = "What is the hardest natural substance on Earth?",
        answers = listOf("Gold", "Diamond", "Platinum", "Silver"),
        correctAnswer = "Diamond"
    ),
    Question(
        question = "Who is the author of 'The Great Gatsby'?",
        answers = listOf("F. Scott Fitzgerald", "Ernest Hemingway", "John Steinbeck", "William Faulkner"),
        correctAnswer = "F. Scott Fitzgerald"
    ),
    Question(
        question = "What is the main ingredient in guacamole?",
        answers = listOf("Tomato", "Onion", "Avocado", "Cilantro"),
        correctAnswer = "Avocado"
    ),
    Question(
        question = "Which country is famous for its tulips?",
        answers = listOf("Italy", "Netherlands", "France", "Germany"),
        correctAnswer = "Netherlands"
    ),
    Question(
        question = "Who discovered penicillin?",
        answers = listOf("Alexander Fleming", "Marie Curie", "Louis Pasteur", "Robert Koch"),
        correctAnswer = "Alexander Fleming"
    ),
    Question(
        question = "Which famous scientist developed the theory of gravity?",
        answers = listOf("Albert Einstein", "Isaac Newton", "Stephen Hawking", "Galileo Galilei"),
        correctAnswer = "Isaac Newton"
    ),
    Question(
        question = "What is the largest type of big cat in the world?",
        answers = listOf("Lion", "Leopard", "Tiger", "Jaguar"),
        correctAnswer = "Tiger"
    ),
    Question(
        question = "What is the chemical symbol for silver?",
        answers = listOf("Ag", "Si", "Sr", "S"),
        correctAnswer = "Ag"
    )








)
