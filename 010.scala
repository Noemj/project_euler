/*
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
*
* Find the sum of all the primes below two million.
*/

object Problem010 {
  def main(args: Array[String]) = println(sum)

  lazy val primeStream: Stream[Int] = 2 #:: Stream.from(3).filter(n => primeStream.takeWhile(y => y <= math.sqrt(n)).forall(n % _ > 0))

  val sum = primeStream.view.takeWhile(_ < 2000000).foldLeft(0L)(_+_)	

  assert(sum == 142913828922L)
}
