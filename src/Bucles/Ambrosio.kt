package Bucles

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    repeat(casos){
        val numPisos = scanner.nextInt()
        var totalBombones = 0

        for (i in 1..numPisos) {
            totalBombones += i * i
        }

        println(totalBombones)
    }
}