// impure 😡
function dirty(max) {
  return Math.floor(Math.random() * Math.floor(max))
}

// pure 😍
function clean(a,b) { // no side-effects => no problem
  return a + b
}

console.log(dirty(42), dirty(42), dirty(42)) // side effects generator
console.log(clean(40,2), clean(40,2), clean(40,2))