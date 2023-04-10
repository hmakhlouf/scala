package objects

object CompanionObjects extends App {   
     
    val acct1 = new Account
    val acct2 = new Account
    val acct3 = new Account
    val acct4 = new Account
     
    println(acct1.id, acct2.id, acct3.id, acct4.id)
    
    acct1.deposit(1000)    
    val d1 = acct1.description    
    
    acct2.deposit(500)
    val d2 = acct2.description
    
    println(d1)
    println(d2)     

}

class Account {    
    val id = Account.newUniqueNumber()
    private var balance = 0.0
    
    def deposit(amount: Double) { balance += amount }
    def withdraw(amount: Double) { balance -= amount }
    def description = "Account " + id + " with balance " + balance 
    
    println(Account.lastNumber)
}

// companion object of "Account" class
object Account {  
    private var lastNumber = 0    
    private def newUniqueNumber() = { lastNumber += 1; lastNumber }        
}















