package Alterntives1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt()
    //Si el dia esta entre 1 o 365 mostrara el texto del println
    if (dia in 1..365) {
        println("Correcte per un any no bixest!")
    }
    //Si el dia es igual a 366 mostrara el texto del println
    else if (dia == 366) {
        println("Correcte per un any bixest!")
    }
    //si el dia esta mal mostrara el println
    else {
        println("Incorrecte!")
    }
}
