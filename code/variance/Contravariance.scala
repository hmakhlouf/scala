package concepts.variance

abstract class Type [-T]{
  def typeName : Unit
}

class SuperType extends Type[AnyVal]{
  override def typeName: Unit = {
    println("SuperType")
  }
}
class SubType extends Type[Int]{
  override def typeName: Unit = {
    println("SubType")
  }
}

class TypeTester{
  def display(t: Type[Int]){
    t.typeName
  }
}

object Contravariance {  
   def main(args: Array[String]) {
      val superType = new SuperType
      val subType = new SubType

      val typeTester = new TypeTester

      typeTester.display(subType)
      typeTester.display(superType)  // possible as Type is defined as contravariant
    
      println("Done.")
   }
}