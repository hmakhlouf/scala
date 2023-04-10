package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureEx5 extends App {
  
  /*
   * The order in which the callbacks are executed is not predefined, 
   * even between different runs of the same application. 
   * 
   * In fact, the callbacks may not be called sequentially one after 
   * the other, but may concurrently execute at the same time. 
   * This means that in the following example the variable totalA 
   * may not be set to the correct number of lower case and 
   * upper case "a" characters from the computed text.
   */
    
    @volatile var totalA = 0

    val text = Future {
       "scala" * 5 + "SCALA LANGUAGE"
    }
    
    text foreach { txt =>
      totalA += txt.count(_ == 'a')
      println("1. totalA = " + totalA)
    }
    
    text foreach { txt =>
      totalA += txt.count(_ == 'A')
      println("2. totalA = " + totalA)
    }
    
    Thread.sleep(1000)
    
    println("3. totalA = " + totalA)
    
    Thread.sleep(500)

}