package concepts.monads

object MonadEx1 extends App {
   val numList1 = List(1,2)
   val numList2 = List(3,4)
   
   // monad
   val numlist3 = numList1.flatMap{ x => numList2.map{ y => x + y } }
   
   // without monad
   val numlist4 = for {first <- numList1; second <- numList2} yield first + second
     
   println(numlist3)
   println(numlist4)
}

/*
Monads are structures that represent sequential computations.
A Monad is an object that wraps another object in Scala. 

In Monads, the output of a calculation at any step is the input 
to other calculations, which run as a parent to the current step.
*/

