package concepts.variance

class Phone[+T](val phone:T)
//class Phone[T](val phone:T)   //This wont work..

class IPhone
class IPhoneX extends IPhone

class ApplePhone(val iphone: Phone[IPhone])

object Covariance{
  def main(args: Array[String]) {
    
    val iphone = new IPhone
    val iphonex = new IPhoneX

    val iphonePhone: Phone[IPhone] = new Phone[IPhone](iphone)
    val iphonexPhone: Phone[IPhoneX] = new Phone[IPhoneX](iphonex)

    val ipApple = new ApplePhone(iphonePhone)
    
    // this is possible as Phone class defined as covariant.
    val ipxApple = new ApplePhone(iphonexPhone)    

    println("Done.")    
  }
}

/*
In the above example, as IPhoneX is subtype of IPhone, 
Phone[IPhoneX] is subtype of Phone[IPhone]. We can use 
Phone[IPhoneX] where we require Phone[IPhone].

This is know as Scala Covariance.
*/
