
import scala.annotation.tailrec

val n: Int = 50
def fibRec(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
  if (n == currentNumber) f2
  else fibRec(n, currentNumber + 1, f2, f1 + f2)
}

println(fibRec(n))