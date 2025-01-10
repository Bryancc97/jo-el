package Iteratius1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var numero = scanner.nextInt()
    var positivos = 0
    var negativos = 0
    //Creamos un while que terminara si ingresan 0
    while (numero != 0) {
        //si el numero es mayor que 0 se sumara a los positivos
        if (numero > 0) {
            positivos++
        }
        //si es menor que 0 se sumara a los negativos
        if (numero < 0) {
            negativos++
        }
        //vuelve a leer el siguiente numero
        numero = scanner.nextInt()
    }
    // si positivo es mayor a negativo mostrara Positius
    if (positivos > negativos) println("POSITIUS")
    //Si negativo es mayor a positivo mostrara negatius
    else if (positivos < negativos) println("NEGATIUS")
    //SI no es ninguna de las anteriores mostrara iguals
    else println("IGUALS")
}