import scala.util.Random

class Urn {
  val balls = List(1, 1, 1, 0, 0, 0) // 1 - белый шар, 0 - черный шар

  def drawTwoBalls(): (Boolean, Boolean) = {
    val shuffledBalls = Random.shuffle(balls)
    (shuffledBalls(0) == 1, shuffledBalls(1) == 1)
  }
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
