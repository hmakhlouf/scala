package concepts.extractors

/*
 * Example: extractor binding only one value
 * matches strings that consist of the same substring appearing twice in a row
 */
object Twice {
  
  def main(args: Array[String]) {
    
     val str1 : Any = "abcabc"
     
     str1 match {
        // this match implicitly calls unapply() method 
        case Twice(str) => println("matched >> " + apply(str))
        case _ => println("not matched")
    }
  }
  
  
  def apply(s: String): String = s + s
  
  def unapply(s: String): Option[String] = {
    val length = s.length / 2
    val half = s.substring(0, length)
    if (half == s.substring(length)) Some(half) else None
  }
}