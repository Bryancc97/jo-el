/*import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //val del numero de casos que ingresaremos
    val casos = scanner.nextInt()
        //bucle que contara de 0 a casos -1
        for(i in 0 until casos){
            //val k seran numeros del 0 al 100
            val k = scanner.nextInt()
            //Array con los numeros ingresados
            val nombres = IntArray(k)
                //bucle que contara de 0 a k -1
                for (i in 0 until k){
                    nombres[i] = scanner.nextInt()
                }
            //val p llamara la posicion del numero que ingresemos
            val p = scanner.nextInt()
            //Contara cuantas veces aparece p en la lista de los numeros
            val contador = nombres.count{it==p}
            println(contador)
        }
}*/

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    scanner.nextLine()  // Consumir el salto de línea

    repeat(casos) {
        val k = scanner.nextInt()
        scanner.nextLine()  // Consumir el salto de línea
        val palabras = List(k) { scanner.nextLine() }

        val longitudValida = palabras.all { it.length == palabras[0].length }
        val secuenciaValida = palabras.zipWithNext().all { contarDiferencias(it.first, it.second) == 1 }

            println(if (longitudValida && secuenciaValida) "CORRECTE" else "INCORRECTE")
    }
}
fun contarDiferencias(p1: String, p2: String) = p1.zip(p2).count { it.first != it.second }
