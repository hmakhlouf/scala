package concepts.implicits

object ImplicitClassCaseClass {
  
  case class CCStringOperations(str: String) {
    def yell = str.toUpperCase() + "!"
    def isQuestion = str.endsWith("?")
  } 
  
  implicit def stringToStringOps(str: String): CCStringOperations = CCStringOperations(str)
  
  println ( "case class >> Hello world".yell )
  println ( "case class >> How are you?".isQuestion )
  
}