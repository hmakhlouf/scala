package concepts.caseclasses

object CaseClassPatternMatching3 extends App {
   abstract class Expr
   case class Var(name: String) extends Expr
   case class Number(num: Double) extends Expr
   case class UnOp(operator: String, arg: Expr) extends Expr
   case class BinOp(operator: String, left: Expr, right: Expr) extends Expr
   
   def simplifyTop(expr: Expr): Expr = expr match {
      case UnOp("-", UnOp("-", e)) => e        // Double negation
      case BinOp("+", e, Number(0)) => e       // Adding zero
      case BinOp("*", e, Number(1)) => e       // Multiplying by one
      case _ => expr
   }
   
   val unop1 = UnOp("-", UnOp("-", Var("x")))
   val binop2 = BinOp("+", Var("x"), Number(0))
   val binop3 = BinOp("*", Var("y"), Number(1))
   
   if (simplifyTop(unop1) == Var("x")) println("1: Matched") else println("1: Didn't match")
   if (simplifyTop(binop2) == Var("x")) println("2: Matched") else println("2: Didn't match")
   if (simplifyTop(binop3) == Var("y")) println("3: Matched") else println("3: Didn't match")   
}