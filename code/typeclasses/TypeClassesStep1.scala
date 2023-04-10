package concepts.typeclasses

object TypeClassesEx1 extends App {
  
   // our generic interface
   trait Shape {
      def area: Double
   }
   
   class Circle(radius: Double) extends Shape {
      override def area: Double = math.Pi * math.pow(radius, 2) 
   }
   
   class Rectangle(length: Double, width: Double) extends Shape {
      override def area: Double = length * width
   }
   
   def areaOf(s: Shape) : Double = s.area
   
   areaOf( new Circle(10) )
   areaOf( new Rectangle(10,20) )   
}



