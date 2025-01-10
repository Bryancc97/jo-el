package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    //Importante examen
    scanner.nextLine()
    repeat(casos) {
        val primera = scanner.nextLine()
        val segunda = scanner.nextLine()
        // longitud de las 2 palabras
        val maxLength = maxOf(primera.length, segunda.length)
        var coincidencias = 0

        // Compara letras en las mismas posiciones
        for (i in 0 until maxLength) {
            if (i < primera.length && i < segunda.length && primera[i] == segunda[i]) {
                coincidencias++
            }
        }
        // Verificar si  mitad de los caracteres son iguales
        if (coincidencias * 2 >= maxLength) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}