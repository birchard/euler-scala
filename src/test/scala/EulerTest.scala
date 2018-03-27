import org.scalatest.{Matchers, FunSuite}

class EulerTest extends FunSuite with Matchers {
  
  test("multiples of 3 and 5 up to 10") {
    Euler.sumOfMultiples(10) should be (23)
  }

  test("multiples of 3 and 5 up to 1000") {
    Euler.sumOfMultiples(1000) should be (233168)
  }
}
