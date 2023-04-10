package concepts.implicits

object ImpBasics extends App {
  
  // Example 1
  // Implicit Variables
  
  implicit val n = "Raju"
  implicit val a = 40
 
  def sayHi(a: Int)(implicit fname: String, age: Int) = {
    println(s"Name: $fname; Age: $age; a: $a !")
  }
  
  sayHi(1)
  
  //Example 2
  // Implicit Type Conversions
  
  implicit def intToStr(num: Int): String = s"The value is $num"

  println ( 99.toUpperCase() ) 
  
  def myFunction(str: String) = str
  println ( myFunction(99) )
    
  //Example 3
  // Implicit methods
  
  case class CCStringOperations(str: String) {
    def yell = str.toUpperCase() + "!"
    def isQuestion = str.endsWith("?")
  } 
  
  implicit def stringToStringOps(str: String): CCStringOperations = CCStringOperations(str)
  
  println ( "case class >> Hello world".yell )
  println ( "case class >> How are you?".isQuestion )

  
  
  // Example 4 - implicit class
  
  // Scala 2.10 introduced implicit classes that can help us 
  // reduce the boilerplate of writing implicit function for 
  // conversion.
  
  //implicit def stringToStringOps(str: String): StringOperations = StringOperations(str)
  
  
  
  
  //println ( "2. Hello world".yell )
  //println ( "How are you?".isQuestion )
  
  /*
  object Helpers {
    
    implicit class StringOperations(str: String) {
      def yell = str.toUpperCase() + "!"
      def isQuestion = str.endsWith("?")
    }
    
    println ( "Helpers >> Hello world".yell )
    println ( "Helpers >> How are you?".isQuestion )
  } 
  * 
  */
  
}




