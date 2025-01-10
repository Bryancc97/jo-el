package `Jo el `

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    //bucle de casos
    repeat(casos) {
        val energia1 = scanner.nextInt()
        val energia2 = scanner.nextInt()
        val energia3 = scanner.nextInt()
        val energia4 = scanner.nextInt()
        val energia5 = scanner.nextInt()
        // Cuando energia  es mayor o igual 10000 muestra M
        if (energia1 >= 10000 || energia2 >= 10000 || energia3 >= 10000 || energia4 >= 10000 || energia5 >= 10000){
            println("M")
        }// O energia es mayor o igual 1000 muestra B
        else if (energia1 >= 1000 || energia2 >= 1000 || energia3 >= 1000 || energia4 >= 1000 || energia5 >= 1000){
            println("B")
        }
        //si no es ninguna H
        else{
            println("H")
        }
    }
}