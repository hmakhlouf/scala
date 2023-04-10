package basics

object LazyValues extends App {
  
    val nonLazyVal = {
        println("<------ initializing nonLazyVal -------> ")     // 1
        "This is nonLazyVal"
    }      
    
    lazy val lazyVal = {
        println("<------ initializing lazyVal -------> ")        // 2
        "This is lazyVal"
    }    
  
    println("<--- nothing is referenced yet --->")               // 3
    println("")
    println("nonLazyVal first time: " + nonLazyVal)              // 4
    println("")
    println("nonLazyVal second time: " + nonLazyVal)             // 5
    println("")
          
    println("lazyVal first time: " + lazyVal)                    // 6
    println("")
    println("lazyVal second time: " + lazyVal)                   // 7
}

