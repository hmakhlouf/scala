package concepts.partial_functions

object PAFBasic extends App {
  
  
  // Example 1  
  val multiply = (a: Int, b: Int, c: Int) => a * b * c
  val f = multiply(1, 2, _:Int)
  println(f(23))
  
  // Example 2
  val divide = (num: Double, den: Double) => {
    num / den
  }
  
  val halfOf: (Double) => Double = divide(_, 2)
      
  val h = halfOf(20)
  println(h)
  
  
  // Example 3
  
  val curriedDivide: (Double) => (Double) => Double = divide.curried
  val curriedHalfOf: (Double) => Double = curriedDivide(_)(2)
  
  val x = curriedHalfOf(100)
  println(x)
  
}