package Bucles

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val nombre = scanner.nextLine()
    var primeraletra = nombre.get(0)
    var respuesta = "NO"
    for (letra in nombre){
        if (primeraletra != letra)
            respuesta = "SI"
    }
    println(respuesta)
}