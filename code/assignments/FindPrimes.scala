package assignments

object FindPrimes extends App {
   
   def isPrime(n: Int) : Boolean = (2 until n).forall(n % _ != 0)
   
   //for (i <- 1 to 100 if isPrime(i)) println(i)
   
   for (i <- 1 to 100) if (isPrime(i))  println(i) 
  
}

/*
The forall method takes a function p that returns a Boolean. 
return true if for every x in the collection, p(x) is true.
*/
