//function soma(a, b) {
//  return a + b
//}

const soma = (a, b) => a + b
const sub = (a, b) => a - b

// Função anônima: Função sem nome
const multi = function (a, b) {
  return a * b;
}

// lambda function / lambdas expressions/ arrow function
// Funções anônimas escritas de maneira reduzida.
const div = (a, b) => a / b

// Função de alta-ordem: Uma função pode ser passada como argumento de outra
// função
function resultado(fun, a, b) {
  return fun(a, b)
}

function resultado1Parametro(fun, a) {
  return fun(a)
}



console.log(resultado(sub, 2, 3))
console.log(resultado1Parametro(a => a ** 2, 3))

// Java, javascript, python, golang, Ruby

// Frameworks (funcional)
// React, React-native, Vue
