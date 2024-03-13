<<<<<<< HEAD

import scala.annotation.tailrec

val n: Int = 50
def fibRec(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
  if (n == currentNumber) f2
  else fibRec(n, currentNumber + 1, f2, f1 + f2)
}

println(fibRec(n))
=======
val i: Any = List(1, 2, 3)

i match {
  case v: Int => println("Int")
  case v: String => println("String")
  case v: List[String] => println("List[String]")
  case v: List[Int] => println("List[Int]")
}
>>>>>>> deb6eb9c2620edb718db6ede82e52bba61cf3fd5
