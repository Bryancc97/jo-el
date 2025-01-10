package `Jo el `

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    scanner.nextLine()
        repeat(casos){
            //Creamos un var que lleve la cuenta de cada vocal
            val frase = scanner.nextLine()
            var contA =0
            var contE =0
            var contI =0
            var contO =0
            var contU =0
            //Contador de vocales mayusculas y minusculas
            for (i in frase) {
                when (i) {
                    'a' -> contA++
                    'e' -> contE++
                    'i' -> contI++
                    'o' -> contO++
                    'u' -> contU++
                    'A' -> contA++
                    'E' -> contE++
                    'I' -> contI++
                    'O' -> contO++
                    'U' -> contU++
                }
            }
            println("A: $contA E: $contE I: $contI O: $contO U: $contU")
        }
}