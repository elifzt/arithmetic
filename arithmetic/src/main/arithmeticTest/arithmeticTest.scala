import org.scalatest.funsuite.AnyFunSuite
import arithmetic.ArithmeticExpression

class ArithmeticTest extends AnyFunSuite {
  test("evaluate should return the correct value") {
    assert(ArithmeticExpression.evaluate(ArithmeticExpression.Num) == 42.0)
    // Diğer evaluate testleri için assert ifadelerini burada ekleyin
  }

  test("pretty should return the correct string representation") {
    assert(ArithmeticExpression.pretty(ArithmeticExpression.Num) == "Num")
    // Diğer pretty testleri için assert ifadelerini burada ekleyin
  }
}
