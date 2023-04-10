package concepts.tailrecursion

import scala.annotation.tailrec

object TailRecEx2 extends App {
  
  println("factorial: " + factorial(5)) 
  println("factorialTr: " + factorialTr(5)) 
  
  def factorial(n: Int): Int = {
      if (n == 0) 1 else n * factorial(n-1)      
  }
  
  def factorialTr(n: Int): Int = {
      @tailrec
      def fact(n: Int, accumulator: Int): Int = {
         if (n == 1) accumulator
         else fact(n - 1, n * accumulator)
      }
      fact(n, 1)
  }
  
}