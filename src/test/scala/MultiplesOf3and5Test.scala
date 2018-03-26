import org.scalatest.{Matchers, FunSuite}

class MultiplesOf3and5Test extends FunSuite with Matchers {
  test("multiples of 3 and 5 up to 10") {
    Multiples.sumOfMultiples(10) should be (23)
  }

  test("multiples of 3 and 5 up to 1000") {
    Multiples.sumOfMultiples(1000) should be (233168)
  }
}
