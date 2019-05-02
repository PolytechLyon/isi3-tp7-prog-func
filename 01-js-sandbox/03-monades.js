// attention, ce code peut piquer les yeux d'un programmeur fonctionnel trop pur == puriste
class Monad {
  constructor(value) {
    this._value = value // pas de propriété privée en JavaScript 😢
  }
  static of(value) { // Unit function: insère une valeur d'un certain type (😂) dans une "structure monadique"
    return new Monad(value)
  }

  map(f) { // Bind function: permet de chainer les opérations entre elles (this is a functor)
    return Monad.of(f(this._value))
  }

  bind(f) { // en Scala ils l'appellent flatMap ... en Haskell map c'est flatMap 🤪
    return f(this._value)
  }

  get() {
    return this._value
  }

}

module.exports = Monad

/*
  Une monade c'est une sorte de Wraper avec une valeur à l'intérieur
  mais on ne peut pas modifier cette valeur
  Toutes les monades sont des functors, tous les functors ne sont pas des monades


  ⚠️ fmap, flatmap, ... ce n'est pas toujours la même chose selon les langages
  https://stackoverflow.com/questions/40025319/fmap-and-flat-map-in-haskell
 */