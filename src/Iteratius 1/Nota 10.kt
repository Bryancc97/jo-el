package `Iteratius 1`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var notas = scanner.nextInt()
    var notastotales = 0
    var notas10 = 0
    while (notas != -1) {
        if (notas in 0..10) {
            notastotales++
            if (notas == 10) {
                notas10++
            }
        }
        notas = scanner.nextInt()
    }
    println("TOTAL NOTES: $notastotales NOTES10: $notas10")
}