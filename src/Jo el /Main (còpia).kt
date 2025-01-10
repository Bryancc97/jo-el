package `Jo el `

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Edad mas el limite de 32
    val edad = scanner.nextInt()
    val covid = 32
    //Si la edad es menor a 32 mostrara si
    if (edad < covid) {
        println("SI")
    }
    //Si la edad es mayor a 32 mostrara no
    else {
        println("NO")
    }
}