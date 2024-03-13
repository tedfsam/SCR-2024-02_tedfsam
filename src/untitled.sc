import scala.util.Random

class Urn {
  val balls = List(1, 1, 1, 0, 0, 0) // 1 - белый шар, 0 - черный шар

val n: Int = 50
def fibRec(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
  if (n == currentNumber) f2
  else fibRec(n, currentNumber + 1, f2, f1 + f2)
}

object Main {
  def main(args: Array[String]): Unit = {
    val experiments = List.fill(10000)(new Urn())

    val results = experiments.map(_.drawTwoBalls())
    val countWhiteBalls = results.count { case (firstBall, secondBall) => firstBall || secondBall }

    val probability = countWhiteBalls.toDouble / (experiments.length * 2)
    println(s"Вероятность появления белого шара: $probability")
  }
}