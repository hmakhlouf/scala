package concepts.extractors

object Email {
  def main(args: Array[String]) {

    println("Apply method : " + apply("Bill", "Gates"));
    println("Unapply method : " + unapply("Steve Jobs"));
    println("Unapply method : " + unapply("Bob"));

  }
  // optional: injection method
  def apply(fname: String, lname: String) = {
    fname + " " + lname
  }

  // mandatory: extraction method
  def unapply(s: String): Option[(String, String)] = {
    val pts = s split " "
    if (pts.length == 2) {
      Some(pts(0), pts(1))
    } else {
      None
    }
  }
}