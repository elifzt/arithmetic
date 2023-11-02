class ArithmeticTest extends AnyFunSuite {
  test("evaluate should return a list of correct values for multiple expressions") {
    val expressions = List(
      ArithmeticExpression.Num,
      ArithmeticExpression.Plus,
      ArithmeticExpression.Minus,
    )

val expectedResults = List(42.0, 7.0, -35.0)

    val results = ArithmeticExpression.evaluate(expressions)
    assert(results == expectedResults)
  }

  test("showResults should return the expressions in a readable format") {
    val expressions = List(
      ArithmeticExpression.Num,
      ArithmeticExpression.Plus,
      ArithmeticExpression.Minus,
    )

    val expectedOutput =
      """Num = 42.0
        |Plus = 7.0
        |Minus = -35.0
        |""".stripMargin
    val output = ArithmeticExpression.showResults(expressions)
    assert(output == expectedOutput)
  }
}
