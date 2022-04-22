// const notas = [10, 7, 4, 3.5, 5, 8]
// Problema1: Quero adicionar 1 ponto para todos as notas do meu array
// Paradigma imperativo
/*const nova_notas = []
for (let x = 0; x < notas.length; x++) {
  nova_notas.push(notas[x] + 1)
}
console.log(nova_notas)
*/

// Paradigma funcional
// transformação de valores
// map: transforma todos os elementos de um array em novos elementos

// const umPontoExtra = nota => 0
// const nova_notas = notas.map(umPontoExtra)
// console.log(nova_notas)


// Problema2: Quero descobrir quais alunos tiraram nota vermelha, dar um ponto a todos 
// eles e verificar quais alunos foram aprovados após o ponto extra

//const notas = [10, 7, 6, 3.5, 5, 8]

//const isReprovado = nota => nota < 7
//const isAprovado = nota => nota >= 7
//const umPontoExtra = nota => nota + 1

//console.log(notas.filter(isReprovado).map(umPontoExtra).filter(isAprovado))







// Paradigma imperativo
/*const notas = [10, 7, 6, 3.5, 5, 8]
const notas_finais = [ ]

for (let x = 0; x < notas.length; x++) {
  notas_finais.push(notas[x] + 1)
}

console.log(notas_finais)
*/

// Paradigma declarativo
// Paradigma funcional
const notas = [10, 7, 6, 3.5, 5, 8]

const notas_finais = notas.map( nota => nota + 1 )

console.log(notas_finais)
