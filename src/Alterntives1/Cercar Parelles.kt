package Alterntives1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numero1 = scanner.nextInt()
    val numero2 = scanner.nextInt()
    val numero3 = scanner.nextInt()
    //Si numero uno es igual a numero 2 y numero 3 mostrara en pantalla SI si es diferente NO
    if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
        println("SI")
    } else {
        println("NO")
    }
}