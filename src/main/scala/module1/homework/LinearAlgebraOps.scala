package module1.homework

/**
 * Реализуйте следующие методы в пакете module1.homework, объект LinearAlgebraOps:
 *
 * Сумма двух векторов. Метод должен называться sum, принимать на вход два вектора в виде массивов целых чисел и возвращать сумму этих двух векторов в виде массива целых чисел. Перед началом вычисления суммы нужно убедиться, что вектора имеют одинаковое кол-во элементов, в противном случае выбросить исключение throw new Exception("Operation is not supported")
 *
 * Реализовать метод под названием scale, который позволяет умножить вектор на скаляр. Метод должен принимать скаляр a c типом целое число и вектор v с типом массив целых чисел. Метод должен возвращать скалированный вектор в виде массива целых чисел.
 *
 * Реализовать метод axpy котрый принимает на вход скаляр a с типом целое число и два вектора v1 и v2 в виде массивов целых чисел и возвращает результат операции axpy в виде вектора представленного массивом целых чисел.
 * Операция axpy это a * v1 + v2, т.е. скалируем первый вектор и складываем со вторым. Здесь также нужно убедиться, что вектора v1 и v2 имеют одинаковое кол-во элементов
 */
object LinearAlgebraOps extends App {

  // скалярное произведение векторов
  val l1 = Array(2, 4, 6)
  val l2 = Array(1, 3, 5)
  val sN = 3

  println("l1 - " + l1.mkString(", "))
  println("l2 - " + l2.mkString(", "))
  println("sN - " + sN)

  def sum(v1: Array[Int], v2: Array[Int]): Array[Int] = {
    if (v1.length != v2.length) {
      throw new Exception("Operation is not supported")
    }
    else {
      v1.zip(v2).map {
        case (x, y) => x + y
      }
    }
  }

  def scale(a: Int, v1: Array[Int]): Array[Int] = v1.map(_ * a) // v1.map(x => x * a)

  def axpy(a: Int, v1: Array[Int], v2: Array[Int]): Array[Int] = {
    if (v1.length != v2.length) {
      throw new Exception("Operation is not supported")
    }
    else {
      sum(scale(sN, v1), v2)
    }
  }

  println("sum - " + sum(l1, l2).mkString(", "))
  println("scale - " + scale(sN, l1).mkString(", "))
  println("axpy - " + axpy(sN, l1, l2).mkString(", "))
}