package concepts.classcomposition_mixin

object ClassCompositionWithMixin1 extends App {
  
   // Mixins are traits which are used to compose a class.
  
   abstract class ClassA {
      val message: String
   }
   class ClassB extends ClassA {
      val message = "From ClassB"
   }
   trait TraitC extends ClassA {
      def loudMessage = "From TraitC >> " + message
   }
  
   class ClassD extends ClassB with TraitC
  
   val d = new ClassD
   println(d.message)  
   println(d.loudMessage)  
}