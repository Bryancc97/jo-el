package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    repeat(casos){
        //Hacemos un bucle de dias
        val dias = scanner.nextInt()
        var alarma = false
        // en el bucle elegira el numero ingresado si es mas grande o igual a 300 mostrara alarma
        repeat(dias){
            val nombres = scanner.nextInt()
            if (nombres >= 300) alarma= true
        }
        if(alarma) println("ALARMA")
        //en caso contrario ok
        else println("OK")
    }
}