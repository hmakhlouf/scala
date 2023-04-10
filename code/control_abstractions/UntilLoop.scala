package control_abstractions

object UntilLoop extends App {
 
  // until loop abstraction
  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }
  
  
  var x = 10
  until (x == 0) {
    x -= 1
    println(x)
  }
  
}