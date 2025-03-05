package `Colleccions 12`

import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() {
    val scanner = abrirScanner()
    val casos = scanner.nextInt()
    scanner.nextLine()

    for (i in 0 until casos) {
        val numNen = scanner.nextInt()
        scanner.nextLine()
        val events = scanner.nextLine()

        val resultat = gestioncola(numNen, events)
        println(resultat)
    }

    cerrarscanner(scanner)
}

fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

fun cerrarscanner(scanner: Scanner) {
    scanner.close()
}

fun gestioncola(numNen: Int, events: String): Int {
    val cola: Queue<Int> = LinkedList()
    var siguiente = numNen
    for (i in 1..numNen) {
        cola.add(i)
    }

    for (event in events) {
        when (event) {
            'S' -> {
                cola.poll()
            }
            'N' -> {
                // El niño que no supera la prueba vuelve a la cola
                val nen = cola.poll()
                cola.add(nen)
            }
            'E' -> {

                siguiente++
                cola.add(siguiente)
            }
        }
    }
    return cola.peek()
}