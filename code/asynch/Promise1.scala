package concepts.asynch

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success, Try}

object Primise1 extends App {
  
  println("======= 1 =======")

  def compute(a: Int, b:Int, op:String): Int = {    
    if (op == "+" || op == "-" || op == "*" || op == "/" ) {
      if (op == "/" && b == 0) throw new IllegalStateException("Error: division by zero")
      else{
        op match {
          case "+" => a + b
          case "-" => a - b
          case "*" => a * b
          case "/" => a / b
          case _ => 0
        }
      }
    }
    else throw new IllegalStateException("Invalid Operation")
  }
  
  val promise1 = Promise[Int]()  
  val future1 = promise1.future
  
  // callback
  future1.onComplete {
    case Success(result) => println(s"Result = $result")
    case Failure(e) => println(s"exception = $e")
  }
  
  promise1.complete(Try(compute(10, 5, "+")))  
  //promise1.complete(Try(compute(10, 5, "/%")))
  //promise1.complete(Try(compute(10, 0, "/")))
 
  //=====================
  
  val promise2 = Promise[Int]()  
  val future2 = promise2.future
  
  future2.onComplete {
    case Success(result) => println(s"Result = $result")
    case Failure(e)     => println(s"exception = $e")
  }
  
  promise2.success(compute(25, 32, "*"))
  //promise2.failure(Try(compute(25, 32, "//")).failed.get)
  
  println("======= 2 =======")
  
  Thread.sleep(2000)
}