package concepts.partial_functions

object PFOrElse extends App {
  
    val M1: PartialFunction[Int, Int] = 
    {
        case x if (x % 5) == 0 => x * 5
    } 

    val M2: PartialFunction[Int, Int] = 
    { 
        case y if (y % 2) == 0 => y * 2
    } 
 
    val r = M1 orElse M2  

    //println("1 ==> " + r(5)) 
    //println("2 ==> " + r(4)) 
    
   println("Output ==> " + r(4))
}

