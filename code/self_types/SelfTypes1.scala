package concepts.self_types

/*
 * Self-types are a way to declare that a trait must 
 * be mixed into another trait, even though it doesn’t 
 * directly extend it. 
 * That makes the members of the dependency available 
 * without imports.
 */

object SelfTypes1 extends App {
  trait User {
    def username: String
  }
  
  trait Tweeter {
    this: User =>  // self type declaration
    def tweet(tweetText: String) = println(s"$username: $tweetText")
  }
  
  // We mixin User with Tweeter because Tweeter required it
  class VerifiedTweeter(val username_ : String) extends Tweeter with User {  
  	def username = s"$username_"
  }
  
  val raju = new VerifiedTweeter("Raju")
  raju.tweet("How are you doing today?")  
}