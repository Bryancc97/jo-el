package `Jo el `

import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val numVeces = scan.nextInt()

    repeat(numVeces) {
        val profundidad = scan.nextInt()
        val diaM = scan.nextInt()
        val nocheM = scan.nextInt()
        var altura = 0
        var diassubida = 0
        var continuar = true
        if (diaM <= nocheM && diaM < profundidad) {
            println("NO")
        } else {
            while (continuar) {
                diassubida++
                altura += diaM

                if (altura >= profundidad) {
                    continuar = false
                } else {
                    altura -= nocheM
                }
            }
            println(diassubida)
        }
    }
}