package concepts.asynch

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureBlockOut2 extends App {
 
  println ("========  1 ========")
  
  val f = Future {
      Thread.sleep(500)
      "From within the future.."
  }

  val result = Await.result(f, 1 second)
  println (result)
   
  println ("========  2 ========")
  
  Thread.sleep(1000)
}