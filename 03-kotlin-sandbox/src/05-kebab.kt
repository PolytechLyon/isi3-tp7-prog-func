data class Ingredient()

fun main(args: Array<String>) {

  val kebabPlateBase: List<Ingredient> = listOf(

  )

  val kebabPlateCmd1: List<Ingredient> = kebabPlateBase.plus(
    listOf(

    )
  )

  // reduction sur les frites et sur le veau (50%)
  val price = kebabPlateCmd1.map {
  }.sumBy {  }

  println(price)


}