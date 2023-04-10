package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

object FutureEx extends App {
  
  val executionContext = ExecutionContext.global
  
  println ("========  1 ========")
  
  val f = Future {
    for(i <- (1 to 100)){ }
    println("Hello Future Example 1")
  }(executionContext)
  
  Thread.sleep(3)
  println ("========  2 ========")
  
  Thread.sleep(1000)
  
}
