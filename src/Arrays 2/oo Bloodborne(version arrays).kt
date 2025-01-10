import java.util.*
fun main (){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
        for (i in 0 until casos){
            val k = scanner.nextInt()
            val letras = IntArray(k)
                for(i in 0 until k) {
                    letras[i] = scanner.nextInt()
                }
            var dobles = false
                for (o in 0 until k -1){
                    if (letras[o] == letras[o +1]){
                        dobles = true
                    }
                }
            if (dobles) {
                println("SI")
            } else {
                println("NO")
            }
        }
}