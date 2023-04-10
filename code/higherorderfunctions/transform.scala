package higherorderfunctions

object transform extends App {
  
  val names = scala.collection.mutable.ArrayBuffer("Kanakaraju", "Veer")
  
  val i = 10
   
  names.foreach(println)  
  
  names.transform( x => x.length.toString )
       
       
  names.foreach(println)   
}