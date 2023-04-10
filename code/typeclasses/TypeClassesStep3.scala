package concepts.typeclasses

object TypeClassesStep3 {
  // our generic interface
   trait Shape[A] {
     def area(a: A): Double
   }
   
   case class Circle(radius: Double)
   case class Rectangle(length: Double, width: Double)
   
   class CircleShape extends Shape[Circle] {
      override def area(circle: Circle): Double = math.Pi * math.pow(circle.radius, 2) 
   }
   
   class RectangleShape extends Shape[Rectangle] {
      override def area(rectangle: Rectangle): Double = rectangle.width * rectangle.length
   }
   
   def areaOf[A](shapeInfo: A, shape: Shape[A]): Double = shape.area(shapeInfo)
   
   areaOf( Circle(10), new CircleShape )
   areaOf( Rectangle(10, 20), new RectangleShape )
}