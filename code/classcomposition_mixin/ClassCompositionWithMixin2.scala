package concepts.classcomposition_mixin

object ClassCompositionWithMixin2 extends App {
  
    abstract class AbsIterator {
      type T
      def hasNext: Boolean
      def next(): T
    }
    
    class StringIterator(s: String) extends AbsIterator {
      type T = Char
      private var i = 0
      def hasNext = i < s.length
      def next() = {
        val ch = s charAt i
        i += 1
        ch
      }
    }
    
    trait RichIterator extends AbsIterator {
      def foreach(f: T => Unit): Unit = while (hasNext) f(next())
    }
    
    class RichStringIter extends StringIterator("Scala") with RichIterator
    
    val richStringIter = new RichStringIter
    richStringIter.foreach(x => print(x.toUpper)) 
}