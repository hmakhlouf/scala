package concepts.asynch

object ParallelCollections2 extends App {
  
  val lastNames = List("Smith","Jones","Frank","Bach", "Jackson","Robin").par
  val pSeq = lastNames.map(_.toUpperCase)
  pSeq.foreach(x => print(x + "; "))
  println()
  
  val parSeqJ = lastNames.filter(_.head >= 'J')
  parSeqJ.foreach(x => print(x + "; "))
  println()
  
  val pArray = (1 to 10000).toArray.par
  println( pArray.fold(0)(_ + _) )
    
  // Non-determinism due to non-associative operation
  println( pArray.fold(0)(_ - _) )
  
  
}