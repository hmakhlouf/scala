package concepts.asynch

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success, Try}

object FutureEx6 extends App {
      
    val futures = (0 to 2)
    .map(i => 1000000L * i until 1000000L * (i + 1))
    .map(range => Future{
      range.sum
    })
    
    val futuresArr = futures.toArray
    val f0 = futuresArr(0)
    val f1 = futuresArr(1)
    val f2 = futuresArr(2)
      
    // Run futures simultaneously in a for-comprehension
    val result = for {
        r0 <- f0
        r1 <- f1
        r2 <- f2
    } yield (r0 + r1 + r2)

    // (c) do whatever you need to do with the result
    result.onComplete {
       case Success(x) => println(s"\nresult = $x")
       case Failure(e) => e.printStackTrace
    }

    // important for a little parallel demo: keep the jvm alive
    sleep(3000)
    
    def sleep(time: Long): Unit = Thread.sleep(time)
}