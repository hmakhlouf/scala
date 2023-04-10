package basics

import scala.io.StdIn

object InputExample extends App { 
  
    def sum(a: Int=0, b: Int=0, c: Int = 0) = {
       println(s"a = $a, b = $b, c = $c")
       a + b + c
    }
    
    val x = sum(20)
    
    println(s"x = $x")
   
}