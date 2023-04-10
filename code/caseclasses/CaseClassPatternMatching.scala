package concepts.caseclasses

object CaseClassPatternMatching extends App {  
   trait Animal
   case class Dog(name: String) extends Animal
   case class Cat(name: String) extends Animal
   case class Cow(name: String) extends Animal
   case object Elephant extends Animal
  
   def getType(x: Animal): String = x match {
      case Dog(name) => "It is a Dog, name = " + name
      case _:Cat => "It is a Cat (ignoring the name)"
      case x:Cow => "It is a Cow, name = " + x.name
      case Elephant => "It is an Elephant"
      case _ => "This is something else"
   }
   
   println(getType(Dog("Lucky")))
   println(getType(Cat("Cuty")))
   println(getType(Cow("Lakshmi")))
   println(getType(Elephant))
}