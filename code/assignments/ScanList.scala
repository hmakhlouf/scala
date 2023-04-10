package assignments

object ScanList extends App {
  println ( scanList( List(1,2,3,4) ) )
   
   println ( scanList( List("A", "B", "C", "D") ) )
   
   
  
  def scanList[A](l: List[A]): List[List[A]] = {
     l.scanLeft( List.empty[A] )( (l, e) => e :: l ) 
      .map(x => reverse(x))
      .tail
  }
   
  def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
  }
}