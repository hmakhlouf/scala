package assignments

import scala.io.StdIn

object FibonacciTailRec {
  
  def main(args: Array[String]){ 
    
    println("How many Fibonacci values should be found : ")
        
    var numFibVals = StdIn.readLine() 
    
    while(!isValid(numFibVals)){
       println("Please enter a positive integer: ")
       numFibVals = StdIn.readLine()
    }      
    
    var i = 1
    while (i <= numFibVals.toInt){
      print( fibonacciTailRec(i) + " " )
      i += 1      
    }     
  }
      
  def fibonacciTailRec(index: Int): Int = {
    @annotation.tailrec
    def getTailRec(index: Int, prev: Int, current: Int): Int = {
      if (index <= 0) {
        current
      } else {
        getTailRec(index - 1, prev = prev + current, current = prev)
      }
    }
  
    getTailRec(index, prev = 1, current = 0)
  }
  
  def getFibonacci(i:Int, j:Int) : Int = { i + j }
  
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

