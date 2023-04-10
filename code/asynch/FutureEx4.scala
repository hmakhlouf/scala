package concepts.asynch

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.io.Source

object FutureEx4 extends App {
  
   println ("========  1 ========")
   
   val f = Future[List[String]] {
      sleep(scala.util.Random.nextInt(500))
      
      Source.fromFile("pledge.txt")
             .getLines
             .filter(_.contains("country"))
             .toList
   }
  
   // You can catch the future either by using onComplete  
   // or by simply using a foreach
      
   /*f.onComplete {
    case Success(value) => {value.foreach(println)}
    case Failure(e) => e.printStackTrace
   }*/
   
   //f.foreach(println)
   f.foreach(_.foreach(println))
   
   println ("========  2 ========")
   
   // keep the jvm alive (may be needed depending on how you run the example)
   sleep(500)
   
   println ("========  3 ========")
   
   def sleep(duration: Long) { Thread.sleep(duration) }    
}