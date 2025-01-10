import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //val para contar el numero de casos
    val casos = scanner.nextInt()
    //Salto de linea
    scanner.nextLine()
    //Bucle para los casos
    for (i in 0 until  casos){
        //Leera la palabra convertida  minusculas, funcion nueva
        val k = scanner.nextLine().lowercase(Locale.getDefault())
        //si es patata mostrara
        if (k == "patata"){
            println("Es Patata")
        }
        //Si no es patata mostrara
        else{
            println("No es Patata")
        }
    }
}