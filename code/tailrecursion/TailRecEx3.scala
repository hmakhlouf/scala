package concepts.tailrecursion

import scala.annotation.tailrec

object TailRecEx3 extends App {
  
  println("gcd: " + gcd(12, 18)) 
    
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}