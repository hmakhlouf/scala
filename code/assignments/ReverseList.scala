package assignments

object ReverseList extends App {
  
  println ( reverse(List(1, 1, 2, 3, 5, 8)) )
  
  def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
  }
}