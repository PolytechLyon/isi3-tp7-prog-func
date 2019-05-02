
function A(name) {
  let message = `👋 ${name}`
  function B(greetings) {
    console.log(`${greetings} ${message}`) // 🙀 this is not functional
  }
  return B
}

A("Bob")("Hello")
