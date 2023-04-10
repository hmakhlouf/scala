package concepts.extractors

object UpperCase {
  def main(args: Array[String]) {     
     val str1 : Any = "RAJU"     
     str1 match {
        case UpperCase() => println("matched >> " + str1)
        case _ => println("not matched")
     }
  }
  
  def unapply(s: String): Boolean = s.toUpperCase == s
}