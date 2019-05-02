class Human(private val name: String) {
  init {
    println("""👋 init ${name}""")
  }

  fun name(): String {
    return name
  }
}


fun main(args: Array<String>) {

  val bob = Human("Bob")
  println(bob.name())

}


