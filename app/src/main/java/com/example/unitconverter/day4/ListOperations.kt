package com.example.unitconverter.day4

fun main() {
    //Creating a Mutable List of Fruits
    var fruitsList = mutableListOf(
        "Apple",
        "Avocado",
        "Cherry",
        "Pear",
        "Plum"
    )
    println(fruitsList)

    //Add a new fruit to fruitsList
    fruitsList.add("Kivi")
    println(fruitsList)

    //Remove a fruit from fruitsList
    fruitsList.remove("Pear")
    println(fruitsList)

    //Use the contains method to check if a specific fruit is in fruitsList
    val isContains = "Cherry"
    if (fruitsList.contains(isContains)) {
        println("You need by $isContains!")
    } else {
        println("There are no such fruits in the list")
    }
}