
fun hello(name: String): String {
  return """Hello ${name}"""
}

fun add(a: Int, b: Int): Int {
  return a + b
}

fun main(args: Array<String>) {

  println(hello("Bob"))

  println(add(10,32))

  // Lambda expression
  val substraction: (Int,Int)->Int = { a, b ->
    a - b
  }

  println(
    substraction(44,2)
  )

  // Anonymous function
  val multiplication = fun(a: Int, b: Int): Int {
    return a * b
  }

  println(
    multiplication(21,2)
  )

}