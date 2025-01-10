package Alterntives1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numero = scanner.nextInt()
    //En el primer if probamos la division con todos los numeros disponibles para saber con cual da 0
    //if (numero % 1 == 0 && numero % 2 == 0 && numero % 3 == 0 && numero % 4 == 0 && numero % 5 == 0 && numero % 6 == 0 && numero % 7 == 0 && numero % 8 == 0 && numero % 9 == 0){
    //Dejamos los 4 numeros mas utiles
    if (numero % 5 == 0 && numero % 7 == 0 && numero % 8 == 0 && numero % 9 == 0) {
        println("SI")
    } else {
        println("NO")
    }
}
