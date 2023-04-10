package assignments

import scala.io.Source
import scala.reflect.io.File
//import java.net.URL

object WordCount {
    def main(args: Array[String]) {
       val filePath: String = "file1.txt"
       val wordcounter = Source.fromFile(filePath)
                        .getLines()                       
                        .flatMap(_.split(" "))            
                        .toList                           
                        .groupBy((word: String) => word)  
                        .mapValues(x => x.length)              
                        .toSeq                            
                        .sortWith(_._2 > _._2)           
                        .foreach(p => println(p._1 + " " + p._2))
      
    }
}