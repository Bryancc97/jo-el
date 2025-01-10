package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    scanner.nextLine()
    repeat(casos) {
        val secuencia = scanner.nextLine()
        val capacidad = scanner.nextInt()
        scanner.nextLine()
        var lalafels = 0
        var telaranyasLlenas = 0
        var telaranyasOcupadas = 0
        // Separar las palabras ,
        val palabras = secuencia.split(", ")
        for (palabra in palabras) {
            when (palabra) {
                "Lalafel" -> lalafels++
                "Telaranya" -> {
                    telaranyasOcupadas++
                }
                //Resetear lalafel si aparece una araña
                "Aranya" -> {
                    lalafels = 0
                    telaranyasOcupadas = 0
                }
            }
        }
        telaranyasLlenas = lalafels/capacidad
        if (telaranyasLlenas > telaranyasOcupadas){
            println("Hay $telaranyasOcupadas telaranyas llenas ")
        }
        else {
            println("Hay $telaranyasLlenas telaranyas llenas ")
        }
    }
}