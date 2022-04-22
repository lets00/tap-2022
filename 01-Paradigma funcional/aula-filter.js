// Filter: Filtrar o conteúdo de um array
const notas = [10, 7, 4, 3.5, 5, 8]
const reprovados = []
// Quero a lista das notas de todos os alunos reprovados

// Paradigma imperativo
for (let x =0; x < notas.length; x++) {
    if (notas[x] < 6) {
        reprovados.push(notas[x])
    }
}
console.log(reprovados)

// Paradigma funcional
const isReprovado = nota => nota < 6