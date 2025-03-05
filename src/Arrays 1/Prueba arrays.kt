/*fun main(args: Array<String>) {
    var arr = arrayOf<String>()
    arr = "una dos tres cuatro cinco".split(" ").toTypedArray()
        println("Tamaño de array: ${arr.size}")
    for (i in arr)
        println(i)
}*/
/*import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()//lee el numero de casos
    for (i in 0 until casos) {
        // Lee en numero de de opciones que votan
        val k = scanner.nextInt()
        val vots = IntArray(k)

        for (i in 0 until k) {
            vots[i] = scanner.nextInt()
        }
        // encuentra la opcion ganadora
        val ganador = vots.indexOf(vots.maxOrNull()!!)

        // Imprimr la opcion ganadora (suma 1 porque  comienzan en 0)
        println(ganador + 1)
    }
}*/
/*import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    // Llegim K, la mida de l'array
    val casos = scanner.nextInt()
    for (i in 0 until casos) {
        // Llegim el nombre K
        val k = scanner.nextInt()
        // Llegim els K nombres
        val nombres = IntArray(k)
        for (i in 0 until k) {
            nombres[i] = scanner.nextInt()
        }
        // Llegim el nombre P
        val p = scanner.nextInt()
        // Imprimim el nombre que ocupa la posició P
        println(nombres[p])
    }
}*/
/*import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Llegim el nombre de casos de prova
    val casosDeProva = scanner.nextInt()
    for (i in 0 until casosDeProva) {
        // Llegim el nombre K
        val k = scanner.nextInt()
        // Llegim els K nombres
        val nombres = IntArray(k)
        for (j in 0 until k) {
            nombres[j] = scanner.nextInt()
        }
        // Llegim el nombre N
        val n = scanner.nextInt()
        // Multiplicar el valor de N a cada posició de l'array
        for (i in nombres.indices) {
            nombres[i] *= n
        }
        //imprimir l'array modificat
        println(nombres.joinToString(" "))
    }
}*/
/*import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Llegim el nombre de casos de prova
    val casos = scanner.nextInt()
    for (i in 0 until casos) {
        // Llegim K
        val K = scanner.nextInt()
        // Llegim els K nombres en un array
        val nombres = IntArray(K)
        for (i in 0 until K) {
            nombres[i] = scanner.nextInt()
        }
        // Llegim el nombre P
        val P = scanner.nextInt()
        // Comptem quantes vegades apareix P en la llista de nombres
        val aparicions = nombres.count { it == P }
        // Mostrem el resultat
        println(aparicions)
    }
}*/
/*import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    // Leer el número de casos de prueba
    val casosDePrueba = scanner.nextInt()
    // Bucle de casos de prueba
    repeat(casosDePrueba) {
        //Leer el número K, que indica cuántos números se van a introducir
        val K = scanner.nextInt()
        //array de enteros de tamaño K y llenarlo con los números ingresados
        val numeros = IntArray(K) { scanner.nextInt() }
        // Leer el número FOLI que se busca en el array
        val FOLI = scanner.nextInt()
        // Buscar la posición del primer elemento que coincide con FOLI
        val posicion = numeros.indexOfFirst { it == FOLI }
        // Imprimir la posición encontrada; si no se encuentra, imprimir -1
        if (posicion == -1) {
            println(-1) // FOLI no encontrado
        } else {
            println(posicion) // Imprimir la posición del primer FOLI encontrado
        }
    }
}*/
/*import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val cops = sc.nextInt()

    for (cas in 0 until cops) {
        val nombreElements = sc.nextInt()
        val numeros = mutableListOf<Int>() // Crea una llista per emmagatzemar els nombres

        for (i in 0 until nombreElements) {
            numeros.add(sc.nextInt()) // Afegeix cada número a la llista
        }

        numeros.sort() // Ordena la llista de nombres en ordre ascendent

        for (i in 0 until nombreElements / 2) {
            // Calcula la suma dels nombres oposats per grandària
            val suma = numeros[i] + numeros[nombreElements - 1 - i]
            println("$suma ")
        }
    }
}*/
/*
fun main() {
    val scan = Scanner(System.`in`)
    //llegin numero de casos
    val casos = scan.nextInt()

    repeat(casos) {
        // tamany del array
        val tamanyArray = scan.nextInt()
        scan.nextLine()
        // arrays que te
        val array = arrayOfNulls<String>(tamanyArray - 1)
        for (numero in 0 until (tamanyArray -1)) {
            array[numero] = scan.nextLine()
        }
        val animalBuscat = scan.nextLine()
        var animalEsta = false

        for (animal in array){
            if (animalBuscat == animal){
                animalEsta = true
            }
        }
        if (animalEsta) {
            println("SI")
        } else {
            println("NO")
        }
    }
}
*/
/*
fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        val import = scanner.nextInt()
        val lista = mutableListOf<Int>() //fem una llista mutable
        var aposta = scanner.nextInt()

        while (aposta > 0) {
            lista.add(aposta) //posem a la llista els valors de l'aposta
            aposta = scanner.nextInt() //nou valors
        }
        lista.sort() //ordenar llista
        var solicitut = 0
        var sumaImport = 0

        for(i in lista){
            if (sumaImport + i <= import){
                sumaImport += i
                solicitut++
            }
        }
        println(solicitut)
    }
}*/
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)

    // Leer el número de casos de prueba
    val casos = scanner.nextInt()

    // Procesar cada caso de prueba
    for (i in 1..casos) {
        // Leer las 7 cartas
        val cartas = IntArray(7)
        for (j in 0 until 7) {
            cartas[j] = scanner.nextInt()
        }

        // Ordenar las cartas
        cartas.sort()

        // Comprobamos si es una Escala Real
        if (cartas.contentEquals(intArrayOf(1, 10, 11, 12, 13))) {
            println("ESCALA REIAL")
        }
        // Comprobamos si es una Escala
        else {
            var esEscala = false
            // Verificar si hay una secuencia de 5 cartas consecutivas
            for (k in 0 until 3) { // Solo necesitamos verificar las primeras 3 posiciones (por el número de cartas)
                if (cartas[k] + 1 == cartas[k + 1] &&
                    cartas[k + 1] + 1 == cartas[k + 2] &&
                    cartas[k + 2] + 1 == cartas[k + 3] &&
                    cartas[k + 3] + 1 == cartas[k + 4]) {
                    esEscala = true
                    break
                }
            }

            if (esEscala) {
                println("ESCALA")
            } else {
                println("NO")
            }
        }
    }
}