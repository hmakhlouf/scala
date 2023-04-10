package concepts.caseobjects

/*
 * Case Objects are singleton version of Case Classes
 * Case Objects: 
 * 		- Do NOT have copy, apply, unapply methods
 *    - Do NOT have method for structural equality comparison
 *    - Have NO Constructor
 * Case Objects:
 *    - Are Serializable
 *    - Have toString and hashCode methods
 */
object CaseObjectEx1 extends App {
  
  case object CaseObjectDemo {
    println("I am a case object")
  }
  
  object PlainObject
  
  object SerializableObject extends Serializable
  
  
  println("1: " + CaseObjectDemo.isInstanceOf[Serializable])
  
  println("2: " + PlainObject.isInstanceOf[Serializable])
  
  println("3: " + SerializableObject.isInstanceOf[Serializable])
  
}

/*
 * Case objects are useful in the following scenarios: 
 * 1) Where we can do pattern matching with case classes and case objects
 * 2) Using case objects as the base structure for Enumerations in scala   
 */

