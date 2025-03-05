import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //Tamaño de array
    val k = scanner.nextInt()
    //consume la linea en blanco
    scanner.nextLine()
    //Creamos el array donde guardara los numeros
    val nombres = IntArray(k)
    // los numeros estaran separados por un espacio
    val numeros = scanner.nextLine().split(" ")
        //i tiene la cuenta de 0 a K -1
        for (i in 0 until k){
            //Muestra el array completo
            nombres [i] = numeros [i].toInt()
        }
    //3 entrada que dice que numero quiere mostar aparte
    val n = scanner.nextInt()
    //imprime la array completo separado por un espacio
    println(nombres.joinToString(" "))
    //imprime el numero en la posicion pedida en val n
    println(nombres[n])
}