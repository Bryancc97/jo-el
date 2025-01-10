//dibujando muñecos es mas facil este ejercicio
//empieza a contar desde el ultimo numero del array o llista
//while o for i --
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        val filas = scanner.nextInt()
        if (filas == 0) return
        val alturas = IntArray(filas) { scanner.nextInt() }
        var maxFilasVisibles = 0
        var alturaMax = 0
        for (altura in alturas) {
            if (altura > alturaMax) {
                maxFilasVisibles++
                alturaMax = altura
            }
        }
        println(maxFilasVisibles)
    }
}