import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //val para llevar el numero de casos
    val casos = scanner.nextInt()
        //bucle de casos
        for (i in 0 until casos){
            //val para los nombres que se ingresaran luego
            val k = scanner.nextInt()
            //Array de numeros que se ingresaran en K
            val numeros = IntArray(k)
            //Bucle  de k
            for (i in 0 until k){

                numeros[i] = scanner.nextInt()
            }
            //val para llamar al numero en la posicion que ingresen
            val p = scanner.nextInt()
            //Del array Numeros sacara la posicion ingresada anteriormente
            println(numeros[p])
        }
}