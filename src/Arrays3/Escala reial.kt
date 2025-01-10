import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Leer el número de casos de prueba
    val casosDePrueba = scanner.nextInt()
    repeat(casosDePrueba) {
        // Array para las cartas
        val cartas = IntArray(7) { scanner.nextInt() }
        val conteoCartas = IntArray(14)
        // Contar las cartas
        for (carta in cartas) {
            conteoCartas[carta]++
        }
        // Verifica si hay una escala real
        val tieneEscalaReal = conteoCartas[10] > 0 && conteoCartas[11] > 0 &&
                conteoCartas[12] > 0 && conteoCartas[13] > 0 &&
                conteoCartas[1] > 0
        // Verificar si hay una escalera
        var tieneEscala = false
        for (i in 1..9) { // Verificamos desde 1 hasta 9
            if (conteoCartas[i] > 0 && conteoCartas[i + 1] > 0 && conteoCartas[i + 2] > 0 &&
                conteoCartas[i + 3] > 0 && conteoCartas[i + 4] > 0) {
                tieneEscala = true
            }
        }
        // Imprimir el resultado
        when {
            tieneEscalaReal -> println("ESCALA REIAL")
            tieneEscala -> println("ESCALA")
            else -> println("NO")
        }
    }
}



