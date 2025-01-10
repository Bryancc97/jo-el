import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //numero de casos necesarios
    val casos = scanner.nextInt()
        //Bucle para los casos
        for(i in 0 until casos){
            //Numero de votos que aran
            val numvotos = scanner.nextInt()
            //Array del numero de votos
            val votos = IntArray(numvotos)
            //Bucle para numvotos
            for(i in 0 until numvotos) {
                //i almacenara el numero de votos
                votos[i] = scanner.nextInt()
            }
            //val para decidir el ganador
            val ganador = votos.indexOf(votos.maxOrNull()!!)
            //Muestra el ganador
            println(ganador +1)
        }
}
