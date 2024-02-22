package com.example.kotlinbasics.bank

fun main() {
    val nikBankAccount = BankAccount("Novikov", 1250.50)

    nikBankAccount.deposit(200.0)
    nikBankAccount.withdraw(1200.0)
    nikBankAccount.displayTransactionHistory()
    println("Balance: ${nikBankAccount.acctBalance()}")
    nikBankAccount.withdraw(300.0)

    val sarahAccount = BankAccount("Sarah", 0.0)
    sarahAccount.deposit(100.0)
    sarahAccount.withdraw(70.0)
    println("Sarah balance ${sarahAccount.acctBalance()}")
    sarahAccount.displayTransactionHistory()

}