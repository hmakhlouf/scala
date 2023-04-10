package controlstructures

import java.io.{FileReader, FileNotFoundException, IOException}

object Exceptions2 extends App { 
      
      try {
         println("Reading from a file ...")   
         val f = new FileReader("file1re.txt")            
      } 
      catch {
         case ex: FileNotFoundException => {
            println("FileNotFoundException exception")
            println( ex.getMessage )
            println( ex.getStackTrace )
         }         
         case _: IOException => {
            println("IO Exception")
         }
         case _: Exception => {
            println("generic exception")
         }
      } 
      finally {
         println("Exiting finally...") 
      }  
   
}