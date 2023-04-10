package concepts.partial_functions


object PFBasic extends App {
  
    val r = new PartialFunction[Int, Int] { 
        def isDefinedAt(q: Int) = q >= 0
        def apply(q: Int) = 12 * q 
    }  
    
    val input = -10
    
    if (r.isDefinedAt(input)) println("1 =>" + r(input))
    else println("2 =>" + r(0 - input))  
    
    
    //println("3 =>" + r(-10))  
}