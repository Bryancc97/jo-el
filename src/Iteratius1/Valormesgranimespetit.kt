package Iteratius1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var numero = scanner.nextInt()
    var maxPositivos: Int? = null
    var maxNegativos: Int? = null

    while (numero != 0) {
        if (numero > 0) {
            if (maxPositivos == null || numero > maxPositivos) {
                maxPositivos = numero
            }
        } else if (numero < 0) {
            if (maxNegativos == null || numero < maxNegativos) {
                maxNegativos = numero
            }
        }
        numero = scanner.nextInt()
    }
    println("$maxPositivos $maxNegativos")

}