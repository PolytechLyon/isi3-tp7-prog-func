data class Tool(val name: String, val price: Int =0)


fun main(args: Array<String>) {

  val tools: List<Tool> = listOf(
    Tool("marteau", 10),
    Tool("tournevis", 20),
    Tool("perceuse", 30)
  )

  println(tools)

  // transformer (obtenir une nouvelle liste)
  val tools2 = tools.map { tool ->
    Tool(tool.name,tool.price + 5)
  }

  println(tools)
  println(tools2)

  // Ajouter un élément à une liste (obtenir une nouvelle liste)
  println(tools.plus(Tool("couteau", 5)))

  println(tools)

  // Calculer une somme
  println(tools.map {it -> it.price}.sum())

  println(tools.sumBy { it -> it.price })
}
