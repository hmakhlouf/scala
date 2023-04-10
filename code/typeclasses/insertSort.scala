package concepts.typeclasses

object insertSort extends App {
  
  val sorted = insertionSort(List(1,4,5,6,2,4,3,6))
  println(sorted)    
  
  def insertionSort(xs: List[Int]): List[Int] = {
    def insert(y: Int, ys: List[Int]): List[Int] =
      ys match {
        case List() => y :: List()
        case z :: zs =>
          if (y < z) y :: z :: zs
          else z :: insert(y, zs)
      }
  
    xs match {
      case List() => List()
      case y :: ys => insert(y, insertionSort(ys))
    }
  }
}