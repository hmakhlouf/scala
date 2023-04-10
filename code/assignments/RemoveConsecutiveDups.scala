package assignments

/*
 * Eliminate consecutive duplicates of list elements. 
 * If a list contains repeated elements they should 
 * be replaced with a single copy of the element. 
 * The order of the elements should not be changed.
 */

object RemoveConsecutiveDups extends App {
  
   println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
   
   println(compressFoldLeft(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
   
  
   def compress[A](l: List[A]):List[A] = l match {
      case Nil => Nil
      case h::List() => List(h)
      case h::tail if (h == tail.head) => compress(tail)
      case h::tail => h::compress(tail)
   }
   
   def compressFoldLeft[A](l: List[A]):List[A] = l.foldLeft(List[A]()) {
      case (List(), e) => List(e)
      case (ls, e) if (ls.last == e) => ls
      case (ls, e) => ls:::List(e)
   }
}












