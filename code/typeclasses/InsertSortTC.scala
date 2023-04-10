package concepts.typeclasses

object InsertSortTC extends App {
  
   val nums = List(-5, 6, 3, 2, 7, -3)
   val fruit = List("apple", "pear", "orange", "pineapple")

   // Pass the comparison function during method call
   val list1 = insertionSort(nums)((x: Int, y: Int) => x < y)
   val list2 = insertionSort(fruit)((x: String, y: String) => x.compareTo(y) < 0)

   println(list1)
   println(list2)
  
   def insertionSort[T](xs: List[T])(lessThan: (T, T) => Boolean) : List[T] = {
     def insert(y: T, ys: List[T]): List[T] = {
        ys match {
          case List() => y :: List()
          case z :: zs =>
            if (lessThan(y, z)) y :: z :: zs
            else z :: insert(y, zs)
        }
     }
     xs match {
        case List() => List()
        case y :: ys => insert(y, insertionSort(ys)(lessThan))
     }    
   }  
}