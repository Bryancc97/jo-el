package `Jo el `

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val Jugador1 = scanner.nextInt()
    val Jugador2 = scanner.nextInt()
    val piedra = 1
    val papel = 2
    val tijeras = 3
    if (Jugador1 in 1..3 && Jugador2 in 1..3) {
        //Si los elecciones son iguales Mostara empate  siguiendo las reglas del juego mostrara el resultado
        when {
            (Jugador1 == Jugador2) -> println("EMPAT")
            (Jugador1 == piedra && Jugador2 == tijeras) ||
                    (Jugador1 == papel && Jugador2 == piedra) ||
                    (Jugador1 == tijeras && Jugador2 == papel) -> println("Jugador1")

            else -> println("Jugador2")
        }
    } else {
        println("ERROR")
    }
}