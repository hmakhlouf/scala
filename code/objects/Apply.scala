package objects

import scala.collection.mutable.{Map, Set}
import scala.collection.mutable._

object Apply extends App { 
    
    /*val acct1 = Account1(1000)
    println(acct1.description)
    
    val acct2 = Account1(10, 2000)
    println(acct2.description)
    
    val list = List(10000, 20000, 30000, 40000)    
    val accounts = list.map( x => Account1(x) )    
    accounts.foreach( acct => println( acct.description ) )
           
    var acct5 = Account1(1000)
    acct5.deposit(500)
    print(acct5.description)
    * 
    */
    
}

class Account1 (val id: Int, initialBalance: Double) {    
    private var balance = initialBalance
    
    def deposit(amount: Double) { balance += amount }
    def description = "Account " + id + " with balance " + balance
}
 
object Account1 {   
    def apply(initialBalance: Double) = {
         println("invoking Account1.apply method - 1")
         new Account1(newUniqueNumber(), initialBalance)
    }
    
    def apply(id: Int, initialBalance: Double) = {
         println("invoking Account1.apply method - 2 ")
         new Account1(id, initialBalance)
    }
    
    private var lastNumber = 0
    private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}













