/*
* The prime factors of 13195 are 5, 7, 13 and 29.
* 
* What is the largest prime factor of the number 600851475143 ?
*
*/

object Problem003 {
  def main(args: Array[String]) = println(pfactors(600851475143L).last)

  def pfactors(n: Long) : List[Long] = (2 to math.sqrt(n).toInt).find(n % _ == 0).map(i => i.toLong :: pfactors(n / i)).getOrElse(List(n))

  assert(pfactors(600851475143L).last == 6857)
}
