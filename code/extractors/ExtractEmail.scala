package concepts.extractors

object ExtractEmail {
  
  def main(args: Array[String]) {
 
    println("apply(\"raju\", \"gmail.com\") : " + apply("raju", "gmail.com"));
    println("unapply(\"raju@gmail.com\") : " + unapply("raju@gmail.com"));
    println("unapply(\"raju\") : " + unapply("raju"));
    
    val emailStr = "my email-id is raju@gmail.com"    
    emailStr match {
        // this match implicitly calls unapply() method 
        case ExtractEmail(user, domain) => println("matched >> " + apply(user, domain))
        
        case _ => println("not matched")
    }

  }
  
  // The injection method (optional)
  def apply(user: String, domain: String) = user +"@"+ domain
  
  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}
