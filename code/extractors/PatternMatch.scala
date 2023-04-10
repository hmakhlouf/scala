package concepts.extractors

case class Student(name: String, address: Seq[Address])
case class Address(city: String, state: String)

object City {
  def unapply(s: Student): Option[Seq[String]] =
    Some( for (c <- s.address) yield c.state)
}

class StringSeqContains(value: String) {
  def unapply(in: Seq[String]): Boolean =  in.contains(value)
}

object PatternMatch {
  def main(args: Array[String]) {

    val stud = List(
        Student("Raju", List(Address("Hyderabad", "Telangana"))),
        Student("Mahesh", List(Address("Bengalore", "Karnataka"))),
        Student("Bhaskar", List(Address("Bengalore", "Karnataka"))),
        Student("Ravi", List(Address("Pune", "Maharashtra")))
      )

    val Tamilnadu = new StringSeqContains("Tamilnadu")
    
    val students = stud collect {
      case student @ City(Tamilnadu()) => student.name
    }
    
    println(students)
  }
}