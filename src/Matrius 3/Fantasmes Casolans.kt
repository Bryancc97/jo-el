import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
        repeat(casos) {
            // Leer dimensiones y número de fantasmas
            val f = scanner.nextInt()
            val c = scanner.nextInt()
            val k = scanner.nextInt()
                // Leer coordenadas de los fantasmas
                val fantasmas = mutableSetOf<Pair<Int, Int>>()
                repeat(k) {
                    val x = scanner.nextInt()
                    val y = scanner.nextInt()
                    fantasmas.add(Pair(x, y))
                }
            // Coordenadas del fantasma azul (el primero)
            val (xAzul, yAzul) = fantasmas.first()
            // Verificar si puede moverse
                val movimientos = listOf(
                    Pair(xAzul - 1, yAzul), // Arriba
                    Pair(xAzul + 1, yAzul), // Abajo
                    Pair(xAzul, yAzul - 1), // Izquierda
                    Pair(xAzul, yAzul + 1) // Derecha
                )
            val bloqueado = movimientos.all { (x, y) ->
                // Está bloqueado si es pared o hay un fantasma
                x <= 0 || x >= f - 1 || y <= 0 || y >= c - 1 || Pair(x, y) in fantasmas
            }
            // Imprimir resultado
            if (bloqueado) {
                println("OH NO")
            } else {
                println("THIS IS FINE")
            }
        }
}