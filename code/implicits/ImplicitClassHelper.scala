package concepts.implicits
 
object HelpersAAA  extends App {
  
  implicit class StringOperations(str: String) {
    def yell = str.toUpperCase() + "!"
    def isQuestion = str.endsWith("?")
  }
  
  println ( "Helpers >> Hello world".yell )
  println ( "Helpers >> How are you?".isQuestion )
} 
  
  