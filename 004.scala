/*
* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
*
* Find the largest palindrome made from the product of two 3-digit numbers.
*/

object Problem004 {
  def main(args: Array[String]) = println(palindrome)

  def palindrome = (100 to 999).view.flatMap(n => (100 to 999).map(_ * n)).filter(n => n.toString == n.toString.reverse).max

  assert(palindrome == 906609)
}
