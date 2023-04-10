package concepts.partial_functions

object PFCase extends App {
  
    val squareRoot: PartialFunction[Double, Double] = {
       case x if x >= 0 => Math.sqrt(x)
    }
    
    val i = 36
    if (squareRoot.isDefinedAt(i)) println("1 => " + squareRoot(i))
    else println(s"2 => Value not defined at $i")
        
    try{
      println("3 => " + squareRoot(36))
      println("4 => " + squareRoot(-36))
    }
    catch {
      case e:MatchError => println("MatchError: " + e.getMessage)
      case e:Exception => println("Exception: " + e.getMessage)
    }   
    
    
}