import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    //Numero de casos
    val n = scanner.nextInt()
    //consume linea
    scanner.nextLine()
        //i tiene en cuenta desde 0 a n -1
    for (i in 0 until n) {
        //numero de datos para array
        val k = scanner.nextInt()
        //creamos el array con los numeros anteriors llamado medida
        val medida = IntArray(k)
        //o tendra en cuenta de 0 a k-1
        for (o in 0 until k){
            //Medidas disponibles
            medida [o] = scanner.nextInt()
        }
        //Talla que tenemos de bambas
        val m = scanner.nextInt()
        //Si la talla es igual un numero menor o un numero superior imprimira SI
        val talla = medida.any { it == m || it == m - 1 || it == m + 1 }
        if (talla) {
            println("SI")
        }
        //Sino No
        else {
            println("NO")
        }
    }
}