import java.util.Scanner
import kotlin.math.round

fun main() {
    val scanner = Scanner(System.`in`)

    // Leer el número de casos
    val N = scanner.nextInt()

    // Procesar cada caso
    for (i in 1..N) {
        // Leer las dimensiones de la matriz (número de alumnos y módulos)
        val numAlumnos = scanner.nextInt()
        val numModulos = scanner.nextInt()

        // Crear la matriz de notas
        val notas = Array(numAlumnos) { IntArray(numModulos) }

        // Leer las notas de los alumnos
        for (j in 0 until numAlumnos) {
            for (k in 0 until numModulos) {
                notas[j][k] = scanner.nextInt()
            }
        }

        // Calcular la media de las notas para cada alumno
        val medias = mutableListOf<Int>()
        for (j in 0 until numAlumnos) {
            val sumaNotas = notas[j].sum()  // Sumar las notas del alumno
            val media = round(sumaNotas.toDouble() / numModulos).toInt()  // Calcular la media y redondear
            medias.add(media)
        }

        // Imprimir las medias para este caso
        println(medias.joinToString(" "))
    }
}
