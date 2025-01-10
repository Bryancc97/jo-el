package Alterntives1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //votos introducidos
    val voto1 = scanner.nextInt()
    val voto2 = scanner.nextInt()
    //Si el voto1 es mas grande que el voto2 muestra Jiden
    if (voto1 > voto2) {
        println("Jiden")
    }
    //Si el voto2 es mas grande que voto1 muestra Drump
    else if (voto2 > voto1) {
        println("Drump")
    }
    //Si es igual el numero muestra No
    else {
        println("No")
    }
}