package demo

import arrow.core.Failure
import arrow.core.Success
import arrow.core.Try

fun divide(a: Double, b: Double): Double {
  return a/b
}

// Try retourne soit un Failure, soit un Success
fun divide2(a: Double, b: Double): Try<Double> {
  val res = a/b
  return when(res) {
    Double.POSITIVE_INFINITY -> Failure(Exception("😡 Infinity"))
    else -> Success<Double>(res)
  }
}

// autre façon de l'utiliser
/*

  return Try { // try catch amélioré

  }


 */



fun main(args: Array<String>) {

  println(divide(5.0, 0.0))

  divide2(5.0, 2.0).let {
    when(it) {
      is Failure -> println(it.exception.message)
      is Success -> println(it.value)
    }
  }


}