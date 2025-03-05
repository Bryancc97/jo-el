import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //Tamaño de array
    val n = scanner.nextInt()
    //Creamos el array donde guardara los numeros
    val numeros = Array(n){0.0}
        for (i in 0 until n){
            val input = scanner.next()
            //Sustituye las ',' por los '.'
            numeros[i] = input.replace(',' , '.').toDouble()
        }
        for (numeros in numeros){
            val porciento = String.format("%.1f%%", numeros*100)
            println("$porciento")
        }
}