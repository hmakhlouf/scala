package concepts.asynch

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureBlockingOut extends App {
  
  println ("========  1 ========")
  
  val f = Future {
      Thread.sleep(500)
      println("From within the future..")
  }

  Await.result(f, 1 second)
  
  println ("========  2 ========")
  
  Thread.sleep(1000)
  
}