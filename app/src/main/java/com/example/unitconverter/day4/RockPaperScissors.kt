package com.example.unitconverter.day4

fun main(){
    var computerChoice = "";
    println("Rock, Paper or Scissors?" +
            " Please set your choice:");
    val playerChoice: String = readln();

    val rundomNumber = (1..3).random();

    when (rundomNumber) {
        1 -> {
            computerChoice = "Rock";
        }
        2 -> {
            computerChoice = "Paper";
        }
        3 -> {
            computerChoice = "Scissors";
        }
    }

    println("Computer choice: $computerChoice")

    val winner = when{
        playerChoice == computerChoice -> "Tie";
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player=)";
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player))";
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player)";
        else -> "Computer";
}

    if (winner == "Tie"){
        println("It's a tie((");
    } else {
        println("$winner won!)))");
    }
}