/*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
*
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

object Problem005 {
  def main(args: Array[String]) = println(res)

  def gcd(a: BigInt, b: BigInt):BigInt = if (b==0) a.abs else gcd(b, a%b)
  
  def lcm(a: BigInt, b: BigInt):BigInt = (a*b).abs/gcd(a,b)

  def res = (BigInt(2) to 20).reduce(lcm)

  assert(res == 232792560)
}
