package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object MultipleFutures2 extends App {

    val startTime = time

    // Future #1
    println(s"creating f1:  $delta")
    val f1 = slowlyDouble(x=1, delay=1500, name="f1")
    
    // Future #2
    Thread.sleep(100)
    println(s"\ncreating f2:  $delta")
    val f2 = slowlyDouble(x=2, delay=250, name="f2")
    
    // Future #3
    Thread.sleep(100)
    println(s"\ncreating f3:  $delta")
    val f3 = slowlyDouble(x=3, delay=500, name="f3")

    println(s"\nentering `for`: $delta")
    val result = for {
        r1 <- f1
        r2 <- f2
        r3 <- f3
    } yield (r1 + r2 + r3)

    println("\nBEFORE onComplete")
    result.onComplete {
       case Success(x) => {
           println(s"\nresult = $x (delta = $delta)")
           println("note that you don't get the result until the last future completes")
       }
       case Failure(e) => e.printStackTrace
    }
    println("AFTER onComplete\n")

    // important for a little parallel demo: keep the jvm alive
    sleep(3000)
    
    def slowlyDouble(x: Int, delay: Int, name: String): Future[Int] = Future {
        println(s"entered $name:  $delta")
        sleep(delay)
        println(s"leaving $name:  $delta")
        x * 2
    }
   
    def delta = System.currentTimeMillis - startTime
    def time = System.currentTimeMillis
    def sleep(time: Long): Unit = Thread.sleep(time)
}