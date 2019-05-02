const Monad = require('./03-monades')

let grannyBottle = Monad.of("🍐")

let addCherry = (content) => content + "🍒"
let addApple = (content) => content + "🍏"
let addPear = (content) => content + "🍐"

let bottleOne = grannyBottle.map(addCherry).map(addApple).map(addPear)
console.log(bottleOne.get())

let addCherryMonad = (content) => Monad.of(content + "🍒")
let addAppleMonad = (content) => Monad.of(content + "🍏")
let addPearMonad = (content) => Monad.of(content + "🍐")

let bottleTwo = grannyBottle.map(addCherryMonad).map(addAppleMonad).map(addPearMonad)
console.log(bottleTwo.get()) // c'est du n'importe quoi

let bottleThree = grannyBottle.bind(addCherryMonad).bind(addAppleMonad).bind(addPearMonad)
console.log(bottleThree.get())




