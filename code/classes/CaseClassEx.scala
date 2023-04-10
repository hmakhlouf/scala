package classes

trait SuperTrait  

case class CaseClass1(a:Int, b:Int) extends SuperTrait  
case class CaseClass2(a:Int) extends SuperTrait         // Case class  
case object CaseObject extends SuperTrait               // Case object  
case class Message(sender: String, recipient: String, body: String) extends SuperTrait

object CaseClassEx {  
  
    def main( args:Array[String] ) { 
         
        matchCase( CaseClass1(100, 200) )  
        matchCase( CaseClass2(10) )  
        matchCase( CaseObject ) 
        matchCase( Message("raju@gmail.com", "aditya@gmail.com", "How are you?") ) 
               
        var c = CaseClass1(10, 10)
        println("c.a = " + c.a)
        println("c.b = " + c.b)         

        val m1 = Message("raju@gmail.com", "aditya@gmail.com", "How are you?")
        val m2 = Message("raju@gmail.com", "aditya@gmail.com", "How are you?")
        println(m1 == m2)
        
        val m3 = m2.copy() 
        println (m3.sender)        
    } 
    
    def matchCase(f: SuperTrait) = f match {
             
        case CaseClass1(x, y) => println("x = " + x + "; y =" + y)  
        case CaseClass2(a)    => println("a = " + a)  
        case CaseObject       => println("This is CaseObject")
        case Message(s, r, _) => println(s"sender: $s, recipient: $r")        
    }  
}  




