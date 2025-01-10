import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    for (i in 1..casos) {
        // Leer dimensiones de la matriz
        val f = scanner.nextInt()
        val c = scanner.nextInt()
        // Empieza la matriz
        val matriz = Array(f) { IntArray(c) }
        // Leer los elementos de la matriz
            for (j in 0 until f) {
                for (k in 0 until c) {
                    matriz[j][k] = scanner.nextInt()
                }
            }
        // Busca el número más grande y su posición
        var maxValor = Int.MIN_VALUE
        var maxFila = 0
        var maxColumna = 0
        for (j in 0 until f) {
            for (k in 0 until c) {
                if (matriz[j][k] > maxValor) {
                    maxValor = matriz[j][k]
                    maxFila = j
                    maxColumna = k
                }
            }
        }
        println("${maxFila + 1} ${maxColumna + 1}")
    }
}