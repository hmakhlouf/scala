package concepts.caseclasses

object CaseClassBasics extends App {
  
    case class Description (description: String)
    case class Product (name: String,  description: Description,  categoryId: Int )
        
    // 1. default apply factory method allows us to instantiate like this
    val myProd = Product("iPhone X", 
                         Description("Silver, 3GB RAM, 64GB Storage"),
                         101)
                         
   // 2. all args are maintained as fields
   println("myProd.name: " + myProd.name)
   println("myProd.description: " + myProd.description)
   
   //3. toString, hashCode and equals are implemented
   println("==== 3 ====")
   println(myProd)   //same as println(myProd.toString)
   println("==== 3 ====")
   println(myProd.hashCode)
   
   if (myProd.description == Description("Silver, 3GB RAM, 64GB Storage")){
      println("description object matched")
   }
   else println("description object did not match")
     
   //4. copy method to create copies
   val myProd2 = myProd.copy(name = "iPhone 6", categoryId = 102)
   val myProd3 = myProd.copy("iPhone 6", Description("Some desc"))
   val myProd4 = myProd.copy()
         
   println(myProd2)
   println(myProd3)
   println(myProd4)   
}