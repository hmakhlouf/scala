package concepts.implicits

object ImplicitClassEx2 extends App {
  
  final class Author(private val name: String) {
    def sayname: String = name
  }
  
  object ImplAuthor {
    implicit class MyAuthor(x: Author) {
      def shoutname: String = x.sayname + "!!!"
    }
  }
  
  import ImplAuthor.MyAuthor
  
  val author:Author = new Author("Jack")
  println (author.sayname)
  println (author.shoutname)
}



