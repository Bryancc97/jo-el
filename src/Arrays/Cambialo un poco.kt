import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
    //
    for(i in 0 until casos){
        val k = scanner.nextInt()
        val numero = IntArray(k)
        for(j in 0 until k){
            numero[j] = scanner.nextInt()
        }
        val P1 = scanner.nextInt()
        val P2 = scanner.nextInt()
        for (j in 0 until k){
            if (numero[j] == P1){
                numero[j] = P2
            }
        }
        println(numero.joinToString(" "))
    }
}