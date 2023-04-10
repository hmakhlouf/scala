package concepts.tailrecursion

import scala.annotation.tailrec

object TailRecursionEx {
  
  def main(args: Array[String]) {
      println("sum: " + sum(List(1,3,5,6,7)))     
      println("factorial: " + factorial(5))      
  }
  
  def sum(list: List[Int]): Int = {
      @tailrec
      def sumWithAccumulator(list: List[Int], currentSum: Int): Int = {
          list match {
              case Nil => currentSum
              case x :: xs => sumWithAccumulator(xs, currentSum + x)
          }
      }
      sumWithAccumulator(list, 0)
  }
  
  def factorial(n: Int): Int = {
      @tailrec
      def fact(n: Int, accumulator: Int): Int = {
         if (n == 1) accumulator
         else fact(n - 1, n * accumulator)
      }
      fact(n, 1)
  }
}