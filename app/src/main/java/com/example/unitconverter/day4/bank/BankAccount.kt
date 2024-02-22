package com.example.kotlinbasics.bank

class BankAccount(
    val accountHolder:String,
    var balance:Double) {

    init {
        println("New account by $accountHolder!!")
    }

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount:Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount:Double){
        if (amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")

        }else{
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

    fun acctBalance():Double{
        return balance;
    }
}