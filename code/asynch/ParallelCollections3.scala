package concepts.asynch

import scala.collection.GenSeq
//import scala.collection.parallel.ParSeq

object ParallelCollections3 extends App {
  
    def largestPalindrome(s: GenSeq[Int]) : Int = {
       s.aggregate(Int.MinValue) (
         (largest, n) => if (n > largest && n.toString == n.toString.reverse) n else largest,
         math.max         
       )
    }
    
    val arr = (0 until 97869).toArray
    
    val lp = largestPalindrome(arr)    
    println("largest palindrome: " + lp)
    
    val lpp = largestPalindrome(arr.par)    
    println("largest palindrome from par: " + lpp)
}