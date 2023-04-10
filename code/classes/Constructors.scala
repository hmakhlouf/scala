package classes

object DemoDuck extends App {
        
    //var d1 = new AuxDuck
    //println (s"size: ${d1.size}, age: ${d1.age}")
    //println ("1-------------------------------")
    
    //var d2 = new AuxDuck(5)
    //println ("2-------------------------------") 
        
    //var d3 = new AuxDuck(5,10)    
    //println ("3-------------------------------")
          
    var d4 = new AuxDuckWithParams(5,10)   //   
    println ("4-------------------------------")
   
    var d5 = new AuxDuckWithParams(5)    
    println ("5-------------------------------")
}

class AuxDuck {
  	var size = 0;
  	var age = 0;
  	
  	println("calling primary constructor: size:" + size + "; age:" + age)
  	
  	// first auxiliary constructor
  	def this(size: Int) {  	  
  		this()   
  		this.size = size
  		println("calling first auxiliary constructor: size:" + size + "; age:" + age)
  	}
  	
  	// second auxiliary constructor calls first auxiliary constructor
  	def this(size:Int, age:Int) {
    		this(size)    
    		this.age= age
    		println("calling second auxiliary constructor: size:" + size + "; age:" + age)
  	}  	
}

class AuxDuckWithParams(val size: Int, val age: Int) {
    println("calling AuxDuckWithParams primary constructor: size:" + size + "; age:" + age);
    
    def this(size:Int){
    		this(size, 0)  
    		println("calling AuxDuckWithParams auxiliary constructor: size:" + size + "; age:" + age)
  	}
    
    def this() {
      this(0)
    }     
}

























