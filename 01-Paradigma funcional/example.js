
// Função anônima: Função sem noma
const soma = function (a, b) {
  return a + b;
}

// Arrow function: Funções anônimas escritas de maneira reduzida
const sub = (a, b) => {
  return a - b
}

// Arrow function reduzida: Funções anônimas escritas de maneira mais reduzida ainda
const mul = (a, b) => a * b;

// Python
// soma = lambda num, num2 : num + num2


/*function sub(a, b) {
  return a - b;
}

function multi() {

}
*/


function resultado(f, num1, num2) {
  return f(num1, num2)
}

//console.log( resultado( soma, 2 , 3) )

console.log( resultado(mul, 2, 3))

