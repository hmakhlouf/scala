package concepts.multithreading

import scala.concurrent.Future

object MultiThreadingLimitations extends App {
  
  class BankAccount(private var amount: Int) {
     override def toString: String = "" + amount

     // this method is not thread safe
     def withdraw(money: Int) = this.amount -= money
     def deposit(money: Int) = this.amount += money
     def getAmount = amount
  } 
  
  //val account = new BankAccount(2000)
  val account = new BankAccount(2000)
  for(_ <- 1 to 1000){
    new Thread( new Thread {
       override def run(): Unit = account.withdraw(1)
    }).start()    
  }
  
  for(_ <- 1 to 1000){
    new Thread( new Thread {
       override def run(): Unit = account.deposit(1)
    }).start()
  }
  println(account.getAmount)
  
  
}


/*
  class SynchronizedBankAccount(@volatile private var amount: Int) {
    override def toString: String = "" + amount

    // this method is not thread safe
    def withdraw(money: Int) = this.synchronized {
      this.amount -= money
    }
    def deposit(money: Int) = this.synchronized {
      this.amount += money
    }
    def getAmount = amount
  }
  * 
  */