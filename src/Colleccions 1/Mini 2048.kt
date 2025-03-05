import java.util.Scanner

fun main(){
    val scanner = abrirScanner()
    val casos = scanner.nextInt()
        for( i in 0 until casos ){
            val tablero = scanner.nextInt()
            val fila = IntArray(tablero)
                for (j in 0 until  tablero){
                    fila[j] = scanner.nextInt()
                }

            val direccion = scanner.next()
                when(direccion){
                    "L" -> moverIzquierda(fila)
                    "R" -> moverDerecha(fila)
                }
        println(fila.joinToString(" "))
        }
    cerrarscanner(scanner)
}

fun moverIzquierda(fila: IntArray) {
    //Fila vacia
    val nuevaFila = IntArray(fila.size) { 0 }
    var indice = 0
        for (i in fila.indices) {
            if (fila[i] != 0) {
                if (indice > 0 && nuevaFila[indice - 1] == fila[i]) {
                    // si el numero es el mismo se añaden
                    nuevaFila[indice - 1] *= 2
                } else {
                    //si no es el mismo numero se deja
                    nuevaFila[indice] = fila[i]
                    indice++
                }
            }
        }
        //Actualiza la fila
        for (i in nuevaFila.indices) {
            fila[i] = nuevaFila[i]
        }
}

fun moverDerecha(fila: IntArray) {
    val nuevaFila = IntArray(fila.size) { 0 }
    var indice = fila.size - 1
        for (i in fila.indices.reversed()) {
            if (fila[i] != 0) {
                if (indice < fila.size - 1 && nuevaFila[indice + 1] == fila[i]) {
                    nuevaFila[indice + 1] *= 2
                } else {
                    nuevaFila[indice] = fila[i]
                    indice--
                }
            }
        }

        for (i in nuevaFila.indices) {
            fila[i] = nuevaFila[i]
        }
}

fun abrirScanner():Scanner{
    val scanner = Scanner(System.`in`)
    return scanner
}

fun cerrarscanner(scanner: Scanner){
    scanner.close()
}