/*
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/

object Problem001 {
  def main(args: Array[String]) = println(sum)

  /*
  * The sum of numbers can be written as 1+2+3+...+x = x*(x+1)/2.
  * The sequence for any number x divisible by y can then be written as y*(x*(x+1)/2).
  * Let z be the number we want to find. With integer division, the highest number x 
  * less than z divisible by y can be expressed as x = z/y.
  */
  def sumDivisibleBy(y: Int, z: Int) = y*(z/y)*((z/y)+1)/2

  def sum = sumDivisibleBy(3, 999) + sumDivisibleBy(5,999) - sumDivisibleBy(15, 999)

  assert(sum == 233168)
}
