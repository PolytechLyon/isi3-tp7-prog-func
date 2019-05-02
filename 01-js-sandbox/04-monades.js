const Monad = require('./03-monades')

let html = Monad.of("Hello 🌍")
console.log(html.get())


function bold(text) {
  return `<b>${text}</b>`
}
function italic(text) {
  return `<i>${text}</i>`
}
function h1(text) {
  return `<h1>${text}</h1>`
}

console.log(
  html.map(bold).map(italic).map(h1).get()
)

console.log(
  html.get()
)