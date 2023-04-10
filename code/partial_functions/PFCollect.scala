package concepts.partial_functions

object PFCollect extends App {
  
    val M: PartialFunction[Int, Int] = 
    { 
        case x if (x % 5) != 0 => x * 5
    } 
  
  
    val y = List(7, 15, 9) collect { M } 
    println(y)  
    
    
    val greaterThan20: PartialFunction[Any, Int] = 
    {
      case i: Int if i > 20 => i
      case _ => 10
    }
    
    val l = List(1, 45, 10, "blah", true, 25) collect greaterThan20 
    println(l)
}


