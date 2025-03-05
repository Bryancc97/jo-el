import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //Tamaño de array
    val k = scanner.nextInt()
    //consume la linea en blanco
    scanner.nextLine()
    //Creamos el array donde guardara las frases
    val string = Array(k) {""}
    //i tiene la cuenta de 0 a K -1
    for (i in 0 until k){
        //Lee el array completo
        string[i] = scanner.nextLine()
    }
    //3 entrada que dice que frase quiere mostar
    val n = scanner.nextInt()
    //imprime la array completo separado por un espacio
    for(string in string){
       println(string)
    }
    //imprime la palabra en la posicion pedida en val n
    println(string[n])
}