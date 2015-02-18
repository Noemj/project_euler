/*
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* 
* What is the 10 001st prime number?
*/

object Problem007 {
  def main(args: Array[String]) = println(nthPrime(10001))

  lazy val primeStream: Stream[Int] = 2 #:: Stream.from(3).filter(n => primeStream.takeWhile(y => y*y <= n).forall(n % _ > 0))

  def nthPrime(n: Int) = primeStream(n-1)

  assert(nthPrime(10001) == 104743)
}
