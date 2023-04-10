package assignments

import scala.io.StdIn

object Fibonacci {
  
  def main(args: Array[String]){ 
    
    println("How many Fibonacci values should be found : ")
        
    var numFibVals = StdIn.readLine() 
    
    while(!isValid(numFibVals)){
       println("Please enter a positive integer: ")
       numFibVals = StdIn.readLine()
    }    
    
    var i = 1
    var (f, s, x) = (1, 1, 0)
    while (i <= numFibVals.toInt) {
      //print( fibonacci(i) + " " )
      if (i <= 2) print(s"1 ");
      else {
        x = f + s;
        f = s;
        s = x;        
        print(x + " ")
      }
      
      i += 1      
    }
  }
  
  /*  
  def fibonacci(num: Int) : Int = {
    if (num == 0) 0
    else if (num == 1) 1
    else {
      fibonacci(num - 2) +  fibonacci(num - 1)
    }
  } */
  
  def isValid(number: String) : Boolean = {
     try {
       val numInt = number.toInt
       numInt > 1
     }
     catch {
       case e:java.lang.NumberFormatException => {
         false    
       }
     }
  }
  
}