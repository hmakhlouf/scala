package concepts.tailrecursion

import scala.annotation.tailrec

object TailRecEx1 extends App {
    
  println("sum: " + sum(List(1,3,5,6,7))) 
  println("sumTr: " + sumTr(List(1,3,5,6,7))) 
    
  def sum(list: List[Int]): Int = {
    var total = 0  
    
    if (list.tail != Nil) total = list.head + sum(list.tail)
    else total += list.head
    
    total 
    
    //if (lst == Nil) 0 else lst.head + sum1(lst.tail)
  }
  
  def sumTr(list: List[Int]): Int = {
      @tailrec
      def sumWithAccumulator(list: List[Int], currentSum: Int): Int = {
          list match {
              case Nil => currentSum
              case x :: xs => sumWithAccumulator(xs, currentSum + x)
          }
      }
      sumWithAccumulator(list, 0)
  }
}