package `Colleccions 1`

import java.util.*

fun main(){
    val scanner = abrirScanner()
    val casos = scanner.nextInt()
    scanner.nextLine()
        for (i in 0 until casos) {
            val entrada = scanner.nextLine()
            if (lisp(entrada)) {
                println("si")
            } else {
                println("no")
            }
        }
    cerrarscanner(scanner)
}

fun lisp(entrada: String): Boolean {
    //Pila para parentesis
    val pila = Stack<Char>()

    for (char in entrada) {
        when (char) {
            //Añade '(' a la pila
            '(' -> pila.push(char)
            ')' -> {
                if (pila.isEmpty()) {
                    return false
                }
                pila.pop() // Elimina el '(' de la pila
            }
        }
    }
    return pila.isEmpty()
}

fun abrirScanner(): Scanner {
    val scanner = Scanner(System.`in`)
    return scanner
}

fun cerrarscanner(scanner: Scanner){
    scanner.close()
}