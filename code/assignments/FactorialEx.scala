package assignments

object FactorialEx {
  
    def fibonacciTailRec(index: Int): Int = {
      
      @annotation.tailrec
      def getTailRec(index: Int, prev: Int, current: Int): Int = {
        if (index <= 0) {
          current
        } else {
          getTailRec(index - 1, prev = prev + current, current = prev)
        }
      }
    
      getTailRec(index, prev = 1, current = 0)
    }
}




