package assignments

object ApplyEx extends App {
  
  /*
  case class ComplexNumber(real: Int, imaginary: Int) {
    def +(number: ComplexNumber): ComplexNumber =
      ComplexNumber(real + number.real, imaginary + number.imaginary)    
      
    def print() = 
      println(s"$real + ${imaginary}i")     
  } 
  */
 
  class ComplexNumber(val real: Int, val imaginary: Int) { 
    
    def +(number: ComplexNumber): ComplexNumber =
      new ComplexNumber(this.real + number.real, this.imaginary + number.imaginary)    
      
    def print() = println(s"$real + ${imaginary}i")     
  } 
  
  class Container  {    
    private val elements = Array("apple","banana","mango","guava") 
    
    def apply(index:Int) = {
        if (index < elements.length) elements(index) 
				else "No element found"
    }
  }
  
  // Ex: 1
  val container = new Container
  println(container(2))
  
  
  //Ex: 2
  val a = new ComplexNumber(1, 2)
  val b = new ComplexNumber(1, -3)

  val c = a.+(b)
  c.print
  
  val d = a + b
  d.print
  
  
}