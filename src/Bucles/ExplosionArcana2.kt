package Bucles

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Daño y vida
    val ini = scanner.nextInt()
    val hp = scanner.nextInt()
    //Valores de daño vida y numero de ataques
    var damage = ini
    var contadorvida = 0
    var numerodeataques = 0
    // Realiza los ataques hasta que la vida llegue a 0 o menos
    while (contadorvida < hp) {
        contadorvida += damage
        numerodeataques++
        // Aumenta el daño en cada ataque
        damage += ini
    }
    println(numerodeataques)
}





