import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    //val del numero de casos que ingresaremos
    val casos = scanner.nextInt()
    //bucle que contara de 0 a casos -1
    for(i in 0 until casos){
        //val k seran numeros del 0 al 100
        val k = scanner.nextInt()
        //Array con los numeros ingresados
        val nombres = IntArray(k)
        //bucle que contara de 0 a k -1
        for (i in 0 until k){
            nombres[i] = scanner.nextInt()
        }
        //val p llamara la posicion del numero que ingresemos
        val foli = scanner.nextInt()
        //Contara cuantas veces aparece foli en la lista de los numeros
        val contador = nombres.indexOfFirst{it==foli}
        if (contador == -1) {
            println(-1)
        } else {
            println(contador)
        }
    }
}