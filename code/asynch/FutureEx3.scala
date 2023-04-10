package concepts.asynch

import scala.concurrent.{Future, ExecutionContext}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

/*
 * Futures provide a way to reason about performing many operations 
 * in parallel – in an efficient and non-blocking way.
 */
object FuturesEx3 extends App {

  // not too exciting, the result will always be 42. but more importantly, when?
  val f = Future {
    sleep(Random.nextInt(800))
    42
  }
  
  f.onComplete {
    case Success(value) => println(s"Got the callback, Value = $value")
    case Failure(e) => e.printStackTrace
  }

  // do the rest of your work
  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)
  
  // keep the jvm alive (may be needed depending on how you run the example)
  sleep(2000)
  
  def sleep(duration: Long) { Thread.sleep(duration) }
}
