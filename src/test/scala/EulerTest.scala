import org.scalatest.{Matchers, FunSuite}

class EulerTest extends FunSuite with Matchers {
  
  test("multiples of 3 and 5 up to 10") {
    Euler.sumOfMultiples(10) should be (23)
  }

  test("multiples of 3 and 5 up to 1000") {
    Euler.sumOfMultiples(1000) should be (233168)
  }

  test("sum of even fibonacci numbers less than 4,000,000") {
    Euler.sumOfEvenFib should be (4613732)
  }

  test("largest prime factor of 13195 is 29") {
    Euler.largestPrimeFactor(13195) should be (29)
  }

  test("largest prime factor of 600851475143 is 29") {
    Euler.largestPrimeFactor(600851475143L) should be (6857)
  }
}
