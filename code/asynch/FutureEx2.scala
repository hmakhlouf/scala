package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.ExecutionContext.Implicits.global

object FutureEx2 extends App {
    
  println ("========  1 ========")
  
  val f = Future {
    for(i <- (1 to 100)){}
    println("Hello Future Example 1")
  }
      
  Thread.sleep(2)
  println ("========  2 ========")
  
  Thread.sleep(1000)
  
}