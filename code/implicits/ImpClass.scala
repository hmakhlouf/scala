package concepts.implicits

object ImpClass {
    implicit class MyString(x: String) {
        def mirror: String = x.reverse
        def addMore: String = x + " and more...."
    }
}