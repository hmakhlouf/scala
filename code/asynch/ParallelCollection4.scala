package concepts.asynch

import scala.collection._

object ParallelCollection4 extends App {
  
  def intersection(a: GenSet[Int], b: GenSet[Int]): Set[Int] = {
    val result = mutable.Set[Int]()
    for(x <- a) if (b contains x) result += x
    result
  }
  
  /*
   * Arbirary modifications to the mutable set can have 
   * arbitrarily corrupt state. 
   * Note: Avoid mutations to the same memory locations
   * without proper synchronization
   */
  
  val seqResult = intersection( (0 until 10000).toSet, (0 until 10000 by 4).toSet )
  val parSeqResult = intersection( (0 until 10000).par.toSet, (0 until 10000 by 4).par.toSet )
  
  println(s"seqResult count: ${seqResult.size}")
  println(s"parSeqResult count: ${parSeqResult.size}")
  
  println("==============================")
  
  def intersectionFilter(a: GenSet[Int], b: GenSet[Int]): GenSet[Int] = {
    if (a.size < b.size) a.filter(b(_))
    else b.filter(a(_))
  }
  
  val seqRes = intersection( (0 until 10000).toSet, (0 until 10000 by 4).toSet )
  val parSeqRes = intersection( (0 until 10000).par.toSet, (0 until 10000 by 4).par.toSet )
  
  println(s"seqRes count: ${seqRes.size}")
  println(s"parSeqRes count: ${parSeqRes.size}")
  
  
}