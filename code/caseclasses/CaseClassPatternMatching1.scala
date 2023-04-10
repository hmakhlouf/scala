package concepts.caseclasses

object CaseClassPatternMatching1 {
  
  case class Employee(id: Int, employee_name: String) // case class
  
  def main(args: Array[String]) {
    
    val a = new Employee(1, "Raju")  
    val b  = new Employee(2, "Aditya")  
    val c  = new Employee(3, "Amrita")
    val d  = new Employee(4, "Harsha")
  
    for (employee <- List(a, b, c, d)) {  
      employee match {  
         case Employee(1, "Raju") => println("Hello Raju")  
         case Employee(2, "Aditya") => println("Hello Aditya")  
         case Employee(4, employee_name) => println("ID: 4, Employee:" + employee_name) 
         case Employee(id, employee_name) => println("ID: " + id + ", Employee:" + employee_name) 
         case _ => println("nothing matched")
      }  
    }  
  }  
}