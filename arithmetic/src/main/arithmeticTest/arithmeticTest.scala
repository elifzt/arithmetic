import org.scalatest.funsuite.AnyFunSuite
import arithmetic.ArithmeticExpression

class ArithmeticTest extends AnyFunSuite {
  test("evaluate should return the correct value") {
    assert(ArithmeticExpression.evaluate(ArithmeticExpression.Num) == 42.0)
  }

  test("pretty should return the correct string representation") {
    assert(ArithmeticExpression.pretty(ArithmeticExpression.Num) == "Num")
  }

  test("evaluate should handle Pow") {
  assert(ArithmeticExpression.evaluate(ArithmeticExpression.Pow, 2, 4) == 16)
}

test("pretty should handle Pow") {
  assert(ArithmeticExpression.pretty(ArithmeticExpression.Pow) == "Pow")
}


}
