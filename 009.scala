/*
* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
*
* a^2 + b^2 = c^2
* For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
*
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.
*/

object Problem009 {
  def main(args: Array[String]) = println(product.head)

  val product = for(b<-2 until 499; a<-1 until b; c=1000-a-b
             if a*a + b*b == c*c) yield a*b*c

  assert(product.head == 31875000)

}
