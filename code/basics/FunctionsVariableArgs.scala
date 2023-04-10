package basics

object FunctionsVariableArgs {
  
  def main(args: Array[String]) {
      printStrings("Hello", "Scala", "Python", "Java");
      
  }
   
  def printStrings( args: String* ) = {
      var i = 0;
      
      for( arg <- args ){
         println(s"Arg value[$i] = $arg");
         i = i + 1;
      }
  }
}