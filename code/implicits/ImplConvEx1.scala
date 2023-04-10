package concepts.implicits

//import scala.language.implicitConversions

object ImplConvEx1 extends App {
  
  implicit def Int2String(number: Int): String = "Coverted: " + number.toString()

  def createNumber: Int = scala.util.Random.nextInt(100)

  val myNumber: String = createNumber
  val text: String = 123
  
  println(myNumber)
  println(text)
  
}