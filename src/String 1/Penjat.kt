import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //val para contar el numero de casos
    val casos = scanner.nextInt()
    //Salto de linea
    scanner.nextLine()
    //Bucle para los casos
    for (i in 1 ..  casos){
        //
        val palabra = scanner.nextLine()
        val intentos = scanner.nextLine().split(" ")
        val resultado = CharArray(palabra.length) { '*' }
            for(intento in intentos){
                for (i in palabra.indices){
                    if (palabra[i].toString() == intento){
                        resultado[i] = intento[0]
                    }
                }
            }
        println(resultado)
    }
}
