package concepts.typeclasses

object TCBasic extends App {  
   
  //println(Show.intCanShow.show(20))    // Regular class invocation 
  
  println(Show.show(150))                // type class invocation
  
}

trait Show[A] {
  def show(a: A): String
}

// Regular Class
/*
object Show {
  val intCanShow: Show[Int] =
    new Show[Int] {
      def show(int: Int): String = s"integer value: $int"
    }
} 
*/

// Type Class version of the above
object Show {
  def show[A](a: A)(implicit sh: Show[A]) = sh.show(a)

  implicit val intCanShow: Show[Int] =
    new Show[Int] {
      def show(int: Int): String = s"integer value: $int"
    }  
}
