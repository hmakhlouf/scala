package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

object FutureEx1 extends App {
  
  implicit val executionContext = ExecutionContext.global
  
  println ("========  1 ========")
  
  val f = Future {
    for(i <- (1 to 100)){}
    println("Hello Future Example 1")
  }
  
  Thread.sleep(2)
  println ("========  2 ========")
  
  Thread.sleep(1000)
  
}