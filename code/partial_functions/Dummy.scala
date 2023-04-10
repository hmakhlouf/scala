package concepts.partial_functions

object Dummy extends App {
  
   val l1 = List(1,2)
   val l2 = List(3,4)
   
   // monad
   val l3 = l1.flatMap{ x => l2.map{ y => x + y } }
    
    
    
}