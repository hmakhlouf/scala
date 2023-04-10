package concepts.implicits

import concepts.implicits.ImpClass.MyString

object ImplicitClassEx1 extends App {
    
  val str1 = "123456".mirror
  println(str1)
  
  val str2 = "123456".addMore 
  println(str2)  
}

