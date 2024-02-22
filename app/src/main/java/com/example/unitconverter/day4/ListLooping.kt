package com.example.unitconverter.day4

fun main() {
    //Create a Mutable List of Integers
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    println(numbers)
    //Loop Through the List
    for (index in 0 until numbers.size) {
        //Double Each Number
        numbers[index] *= 2
    }
    println(numbers)
}