object ArithmeticExpression {
  // Enumerated values
  object ArithmeticExpressionEnumeration extends Enumeration {
    type ArithmeticExpression = Value
    val Num, Minus, Plus, Mult, Div, Pow = Value
  }

  // Import enum values
  import ArithmeticExpressionEnumeration._

  // Method to evaluate an arithmetic expression
  def evaluate(expression: ArithmeticExpression): Double = expression match {
    case Num => 42.0 // Örnek olarak, Num ifadesini 42 olarak değerlendirelim.
    case Minus => // Minus ifadesinin hesaplamasını ekleyin
    case Plus => // Plus ifadesinin hesaplamasını ekleyin
    case Mult => // Mult ifadesinin hesaplamasını ekleyin
    case Div => // Div ifadesinin hesaplamasını ekleyin
    case Pow => // Pow ifadesinin hesaplamasını ekleyin
  }

  // Method to format arithmetic expressions in infix notation
  def pretty(expression: ArithmeticExpression): String = expression match {
    case Num => "Num"
    case Minus => "Minus"
    case Plus => "Plus"
    case Mult => "Mult"
    case Div => "Div"
    case Pow => "Pow"
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val expr = ArithmeticExpressionEnumeration.Num // Örnek bir ifade seçin
    val result = evaluate(expr)
    val formatted = pretty(expr)

    println(s"Expression: $formatted")
    println(s"Result: $result")
  }
}
