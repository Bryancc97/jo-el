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
        //i tiene en cuenta desde 0 a k -1
        for (i in 0 until k){
            //muestra el array completo
            nombres[i] = numeros[i].toInt()
        }
    //val para poder ingresar el numero que sumaremos
    val n = scanner.nextInt()
    //i tendra en cuenta desde 0 a k -1
    for (i in 0 until k){
        //Muestra sumara el numero val n al los numeros de array
        nombres [i] +=n
    }
    //Mostrara el array entero sumado con el num de val n
    println(nombres.joinToString(" "))
}