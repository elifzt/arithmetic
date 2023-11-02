package arithmetic

object ArithmeticExpression extends Enumeration {
  type ArithmeticExpression = Value
  val Num, Minus, Plus, Mult, Div, Pow = Value
}

object Main {
  // Method to evaluate an arithmetic expression
  def evaluate(expression: ArithmeticExpressionEnumeration.ArithmeticExpression): Double = expression match {
    case ArithmeticExpression.Num => 42.0 // Num ifadesini 42 olarak değerlendirelim
    case ArithmeticExpression.Minus => -42.0 // Minus ifadesinin hesaplamasını ekleyin
    case ArithmeticExpression.Plus => 5.0 // Plus ifadesinin hesaplamasını ekleyin
    case ArithmeticExpression.Mult => 20.0 // Mult ifadesinin hesaplamasını ekleyin
    case ArithmeticExpression.Div => 2.0 // Div ifadesinin hesaplamasını ekleyin
    case ArithmeticExpression.Pow => 8.0 // Pow ifadesinin hesaplamasını ekleyin
  }

  // Method to format arithmetic expressions in infix notation
  def pretty(expression: ArithmeticExpressionEnumeration.ArithmeticExpression): String = expression match {
    case ArithmeticExpression.Num => "Num"
    case ArithmeticExpression.Minus => "Minus"
    case ArithmeticExpression.Plus => "Plus"
    case ArithmeticExpression.Mult => "Mult"
    case ArithmeticExpression.Div => "Div"
    case ArithmeticExpression.Pow => "Pow"
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val expr = ArithmeticExpression.Num // Örnek bir ifade seçin
    val result = evaluate(expr)
    val formatted = pretty(expr)

    println(s"Expression: $formatted")
    println(s"Result: $result")
  }
}
