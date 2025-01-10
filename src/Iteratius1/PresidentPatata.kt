package Iteratius1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    //repite los casos el primer numero que ingresemos, despues de dejara un espacio
    //con el println
    repeat(casos) {
        //repite la frasde del println el numero que ingresemos
        val numero = scanner.nextInt()
        repeat(numero) {
            println("No ofendre al president patata")
        }
        println()
    }
}