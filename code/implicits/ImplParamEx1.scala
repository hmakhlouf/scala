package concepts.implicits

object ImplParamEx1 extends App {
  
  def sendMessage(message: String)(implicit from: String): String = { 
     s"$message \n\nRegards\n$from"
  }
  
  implicit val sender: String = "Aditya"
  
  val msg1 = sendMessage("How are you?")("Veer")
  println(msg1)
  println ("============================")
  
  val msg2 = sendMessage("How are you Raju?")
  println(msg2)  
}