package control_abstractions

object ComputeTime extends App {
  
  def time[R](block: => R): R = {
      val t0 = System.nanoTime()
      val result = block    // call-by-name
      val t1 = System.nanoTime()
      println("Elapsed time: " + (t1 - t0)/1000000 + " milli-seconds")
      result
  }
  
  var list = time { println("Hi"); List.range(1, 1000000, 1) }
  
  var list2 = time { println("Hello"); 1 to 1000000 by 1 toList } 
}