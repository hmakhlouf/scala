package concepts.extractors

object Domain {
  
    def main(args: Array[String]) { 
       extractParts("tekcrux.com")
       extractParts("www.tekcrux.com")
       extractParts("www.tekcrux.co.in")
       isDomain("tekcrux.com")
       isDomain("www.tekcrux.net")
       isDomain("www.tekcrux.org")
    }
    
    def extractParts(s: String) : Unit = {
      s match {
        case Domain(a, b) => println(Domain(a, b)); 
        case Domain(a, b, c) => println(Domain(a, b,c)); 
        case Domain(a, b, c, d) => println(Domain(a, b, c, d)); 
        case _ => println("extractParts > not matched"); 
      }
    }
    
    def isDomain(s: String) : Unit = {
      s match {
        case Domain("com", _*) => println("Its .com domain"); 
        case Domain("net", _*) => println("Its .net domain");        
        case _ => println("isDomain > not matched"); 
      }
    }
    
    // The injection method (optional)
    def apply(parts: String*): String = parts.reverse.mkString(".")
    
    // The extraction method (mandatory)
    def unapplySeq(whole: String): Option[Seq[String]] = Some(whole.split("\\.").reverse)
}