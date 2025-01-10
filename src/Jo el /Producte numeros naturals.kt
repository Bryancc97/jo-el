package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    repeat(casos){

        val numeros = scanner.nextInt()
        //si el numero es menor o igual a 0 mostrara  el println
        if ( numeros <=0){
            println("ELS NOMBRES NATURALS COMENCEN EN 1")
        }
        else{
            //damos un valor a suma(0) y a producto(1)
            var suma = 0
            var producto = 1
            //i contara los numeros de 1 al numero ingresado
            for (i in 1..numeros){
                //sumara los numeros de 1 a numero
                suma += i
                //multriplicara los numeros
                producto *= i
            }
            println("SUMA: $suma PRODUCTE:$producto")
        }
    }
}