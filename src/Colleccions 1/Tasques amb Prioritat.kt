package `Colleccions 91`

import java.util.*

fun main(){
    val scanner = abrirScanner()



    cerrarscanner(scanner)
}

fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

fun cerrarscanner(scanner: Scanner) {
    scanner.close()
}