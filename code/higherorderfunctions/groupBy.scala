package higherorderfunctions

object groupBy extends App {
  
    val names = List("Raju", "Aditya", "Kiran", "Hari", "Ramu", "Viswa", "Anand")
    val map = names.groupBy(x => x.substring(0,1))
    map.foreach(println)
}

 