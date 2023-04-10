package concepts.partial_functions

object PFAndThen extends App {
  
  // Creating Partial function 
  val M: PartialFunction[Int, Int] =
  { 
      case x if (x % 4) != 0 => x * 4
  } 

  // Creating another function 
  val append = (x: Int) => x * 10

  // Applying andThen method  
  val myNewFn = M andThen append
  
  println( myNewFn(16) ) 
}