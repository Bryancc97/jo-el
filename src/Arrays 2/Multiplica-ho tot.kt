import java.util.*
fun main (){
    val scanner = Scanner(System.`in`)
    //val para el numero de casos
    val casos = scanner.nextInt()
        //Bucle que contara de 0 a casos -1
        for (i in 0 until casos){
            // val para numeros
            val k = scanner.nextInt()
            //Creacion de arra usando los numeros de K
            val nombre = IntArray(k)
                //Bucle que contara de 0 a k -1
                for (o in 0 until k){
                    //guardara los numeros anteriores en nombre
                    nombre[o] = scanner.nextInt()
                }
            //val para llamar al numero que este en la posicion
            val p = scanner.nextInt()
                //Bucle que contara de 0 a k -1
                for (i in 0 until k){
                    //Multplicara el numero por la posicion elegida
                    nombre[i] *= p
                }
                println(nombre.joinToString(" "))
        }
}