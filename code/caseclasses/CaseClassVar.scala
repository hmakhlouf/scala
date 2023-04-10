package concepts.caseclasses

object CaseClassVar extends App {  
  case class Person(var name:String)
  
  var person = Person("Raju")
  println("person.name: " + person.name)
  person.name = "Aditya"
  println("person.name: " + person.name)
}