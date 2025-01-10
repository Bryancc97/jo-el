package Iteratius1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    //Repite los casos que ingresamos
    repeat(casos) {
        val numero = scanner.nextInt()
        //creamos variables asignadndoeles valor 0
        var parells = 0
        var senars = 0
        if (numero <= 0) {
                //Cuenta del num que ingresamos al 0
            for (num in 1..numero) {
                if (num % 2 == 0) {
                    parells += num
                } else
                    senars += num
            }
            println("PARELLS: $parells SENARS: $senars")
        }
    }
}