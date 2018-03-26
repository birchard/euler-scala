object Multiples {
  def sumOfMultiples(n: Int): Int = {
    1 to n-1 filter(i => i % 3 == 0 || i % 5 == 0) sum
  }
}
