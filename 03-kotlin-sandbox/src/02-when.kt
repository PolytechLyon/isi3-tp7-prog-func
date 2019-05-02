
fun main(args: Array<String>) {

  val test: (Int,Int)-> Boolean = { a, b ->
    a == b
  }

  when(test(4,5)) {
    true -> println("You won 😃")
    false -> println("You lost 😡")
  }

  val something: (String) -> Any = { a ->
     when(a) {
       "bool:true" -> true
       "bool:false" -> false
       "string" -> "Hello"
       "integer" -> 42
       else -> Unit
     }
  }

  val res = something("toto")
  when(res) {
    is Boolean -> println("""${res} is Boolean""")
    is String -> println("""${res} is String""")
    is Int -> println("""${res} is Integer""")
    is Unit -> println("💥")
  }

  something("integer").let {
    when(it) {
      is Boolean -> println("""${it} is Boolean""")
      is String -> println("""${it} is String""")
      is Int -> println("""${it} is Integer""")
      is Unit -> println("💥")
    }
  }


}