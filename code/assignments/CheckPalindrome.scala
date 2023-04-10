package assignments

object CheckPalindrome extends App {
  
  val r1 = isPalindrome(List(1, 2, 3, 2, 1))
  println(r1)
  
  val r2 = isPalindromeRecursive(List(1, 2, 3, 2, 1))
  println(r2)
  
  val r3 = isPalindromeTR("malayalam".toList)  //isPalindromeTR(List(1, 2, 3, 2, 1))
  println(r3)
  
  
  def isPalindrome[A](l: List[A]):Boolean = {
    l == l.reverse
  }
  
  def isPalindromeRecursive[A](l: List[A]):Boolean = l match {
    case Nil => true
    case List(a) => true
    case list => (list.head == list.last && isPalindromeRecursive(list.tail.init))
  }
  
  /*
   if you have a recursive function that calls itself as its 
   last action, then you can reuse the stack frame of that function. 
   This is called tail recursion.
   
   We could say a tail recursive function is the functional 
   form of a loop, and it executes just as efficiently as a loop
  */
  def isPalindromeTR[A](l: List[A]):Boolean = {
    def _palindrome(res: Boolean, list: List[A]): Boolean = list match {
        case Nil => res
        case List(a) => res
        case list => _palindrome(res && list.head == list.last, list.tail.init)
    }
    _palindrome(true, l)
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}