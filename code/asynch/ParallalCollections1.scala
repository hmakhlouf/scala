package concepts.asynch

object ParallalCollections1 extends App {
  
  def fibonacci(n: Int):Int = {
     if (n < 2) 1 
     else fibonacci(n-1) + fibonacci(n-2)
  }
  
  for (i <- (30 to 15 by -1).par) {
    println ( s"fibonacci($i) = " + fibonacci(i))
  }   
  
  // Program: 2
  // non-determinism due to side-effect
  var i = 0;
  for( j <- (1 to 10000).par ) {
    i += 1    
  }
  print("i = " + i)  // why?
  
  
  Thread.sleep(1000)
}