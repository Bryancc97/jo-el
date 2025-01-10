package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos   = scanner.nextInt()
    //Le damos valor 0 a numeros positivos
    var numpositivos = 0
        repeat(casos){
            val numeros = scanner.nextInt()
            //Si el numero ingresado es mas grande de 0 lo contara con numpositivos
            if (numeros > 0){
                numpositivos++
            }
        }
        println(numpositivos)
}