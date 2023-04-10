package controlstructures
 
import scala.math.sqrt

object Exceptions extends App {  
  
    def squareRoot(x: Double) = {
       if (x >= 0) { 
          sqrt(x) 
       } 
       else {
          throw new IllegalArgumentException("Input should not be negative.")
       }
    }
    
    try {
       //println( squareRoot(16) )
       println( squareRoot(-16) )   
    } 
    catch {     
       case e: IllegalArgumentException => {
         println( e.getMessage )
         println("Caught IllegalArgumentException from the catch block")
       }
       case e: Exception => println(e.getMessage())
    } 
    finally {
      println("Done!!")
    }
    
}



