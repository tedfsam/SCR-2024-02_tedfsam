import module1.{hof, lazyOps, list, type_system}

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    val l1 = list.List(1, 2, 3)
    val l2 = list.List(4, 5, 6)

    val f: String => Unit = hof.logRunningTime(hof.doomy)
    f("ooops")


  }
}

