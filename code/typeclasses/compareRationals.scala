package concepts.typeclasses

object compareRationals extends App {
  
  class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    def printr {
      println(numer + "/" + denom)
    }
    lazy val numer: Int = x / g
    lazy val denom: Int = y / g
  }
  
  def insertionSort[T](xs: List[T])(lessThan: (T, T) => Int) : List[T] = {
     def insert(y: T, ys: List[T]): List[T] = {
        ys match {
          case List() => y :: List()
          case z :: zs =>
            if (lessThan(y, z) < 0) y :: z :: zs
            else z :: insert(y, zs)
        }
     }
     xs match {
        case List() => List()
        case y :: ys => insert(y, insertionSort(ys)(lessThan))
     }    
  }  

  val compareRationals: (Rational, Rational) => Int = {
    (x, y) => {
      if ((x.numer == y.numer) && (x.denom == y.denom)) 0
      else if (x.numer * y.denom > y.numer * x.denom) 1
      else -1
    }
  }
  
  /*implicit val rationalOrder: Ordering[Rational] = {
    new Ordering[Rational] {
      def compare(x: Rational, y: Rational): Int = compareRationals(x, y)
    }
  }*/
  
  val half = new Rational(1, 2)
  val third = new Rational(1, 3)
  val fourth = new Rational(1, 4)
  val rationals = List(third, half, fourth)
  
  val list1 = insertionSort(rationals)(compareRationals)
  for(num <- list1) num.printr    //println(num.numer + "/" + num.denom)
  
}