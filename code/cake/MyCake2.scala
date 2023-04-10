package concepts.cake

object MyCake2 extends App {

  trait AnotherTrait {
    // Some method
  }

  trait GenericDao { // This is an 'interface'
    def Imp: String
  }

  trait SqlDao extends GenericDao { // This is like implementing interface with default in Java8 (An implementation)
    def Imp: String = "SQL Implementation"
  }

  trait CloudantDao extends GenericDao { // This is like implementing interface with default in Java8 (An implementation)
    def Imp: String = "Cloudant Implementation"
  }

  trait MyServiceTrait {
    // This relies on 'interface' instead of 'implementation' - it just normal Java/Spring best practice anyway.
    this: GenericDao with AnotherTrait => // Syntax for trait 'self type annotation', we really should just call it 'extending an interface'
    println("My implementation is: " + this.Imp)
  }

  // service customisation (inject stuff here)
  val svc = new MyServiceTrait with CloudantDao with AnotherTrait
  println("svc using Cloudant DI returns: " + svc.Imp)

  val svc2 = new MyServiceTrait with SqlDao with AnotherTrait
  println("svc2 using SQL DI returns: " + svc2.Imp)

}