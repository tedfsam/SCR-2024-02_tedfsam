val i: Any = List(1, 2, 3)

i match {
  case v: Int => println("Int")
  case v: String => println("String")
  case v: List[String] => println("List[String]")
  case v: List[Int] => println("List[Int]")
}