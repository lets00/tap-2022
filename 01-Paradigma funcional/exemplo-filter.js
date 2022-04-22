//Filter

// Quero filtar pelos alunos que estão aprovados

//Abordagem 1: Paradigma imperativo
/*for (let x = 0; x < notas.length; x++) {
  if (notas[x] >= 7) {
    aprovados.push(notas[x])
  }
}

console.log(aprovados)
*/

// Abordagem 2: Paradigma funcional
// Filtrando uma informação

// Função filter: Filtra um array baseado em uma condição ser true ou false
// Se for true: salvar em um novo array
// Ser for false: descartar

const notas = [10, 7, 4, 3.5, 5, 8]
const aprovados = notas.filter(nota => nota >= 7)

console.log(aprovados)
