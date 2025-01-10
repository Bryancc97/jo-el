package `Jo el `

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val palabra =scanner.nextLine()
    var vocales = "aeiou"

    if(vocales.all { palabra.contains(it) }){
        println("TOTES")
    }
    else{
        println("FALTEN")
    }
}