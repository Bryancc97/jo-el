import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Leemos la cantidad de casos A y el tamaño del banco B
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    // Repetimos para cada caso
    for (i in 1..A) {
        // Leemos los números de Pokémon y sus niveles
        val pokemonList = mutableListOf<Int>()
        val nivel = mutableListOf<Int>()
        for (j in 0 until B) {
            pokemonList.add(scanner.nextInt()) // Pokémon (números de Pokédex)
        }
        for (j in 0 until B) {
            nivel.add(scanner.nextInt()) // Niveles correspondientes
        }

    }
}
