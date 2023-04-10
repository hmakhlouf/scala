package concepts.compound_types

/*
 * Sometimes it is necessary to express that the type of an 
 * object is a subtype of several other types. 
 * 
 * In Scala this can be expressed with the help of compound types, 
 * which are intersections of object types.
 */
object CompoundTypes1 extends App {
   
  def callAndFeed(dog: Callable with Feedable) {
    dog.call()
    dog.feed()
  }
  
  trait Callable {
    def call() { println("Comes to you") }
  }
  
  trait Feedable {
     def feed() { println("Feeds") }
  }
  
  class Dog1 extends Callable
  
  class Dog2 extends Feedable
  
  class Dog3 extends Callable with Feedable
  
  /*class Dog3 extends Callable with Feedable {
     override def call() { println("Comes to you 2") }     
  }*/
    
  val dog1 = new Dog1
  dog1.call
  
  val dog2 = new Dog2
  dog2.feed
  
  val dog3 = new Dog3
  dog3.call
  dog3.feed  
  
  callAndFeed(dog3)
}