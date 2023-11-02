package arithmetic

object ArithmeticExpression extends Enumeration {
  type ArithmeticExpression = Value
  val Num, Minus, Plus, Mult, Div, Pow = Value
}

object Main {
  // Method to evaluate an arithmetic expression
  def evaluate(expression: ArithmeticExpression.ArithmeticExpression): Double = expression match {
    case ArithmeticExpression.Num => 42.0
    case ArithmeticExpression.Minus => -42.0
    case ArithmeticExpression.Plus => 5.0
    case ArithmeticExpression.Mult => 20.0
    case ArithmeticExpression.Div => 2.0
    case ArithmeticExpression.Pow => Math.pow(operand1, operand2).toInt
  }

  // Method to format arithmetic expressions in infix notation
  def pretty(expression: ArithmeticExpression.ArithmeticExpression): String = expression match {
    case ArithmeticExpression.Num => "Num"
    case ArithmeticExpression.Minus => "Minus"
    case ArithmeticExpression.Plus => "Plus"
    case ArithmeticExpression.Mult => "Mult"
    case ArithmeticExpression.Div => "Div"
    case ArithmeticExpression.Pow => "Pow"
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    val expr = ArithmeticExpression.Num
    val result = evaluate(expr)
    val formatted = pretty(expr)

    println(s"Expression: $formatted")
    println(s"Result: $result")
  }
}
