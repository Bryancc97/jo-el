import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
        for (i in 0 until casos){
            val alumnos = scanner.nextInt()
            val modulos = scanner.nextInt()
            val notas = Array(alumnos){ IntArray(modulos)            }
                for (o in 0 until alumnos){
                    for (p in 0 until modulos){
                        notas[o][p] = scanner.nextInt()
                    }
                }
            val media = mutableListOf<Int>()
                for (o in 0 until alumnos){
                    val sumaNotas = notas[o].sum()
                    val media = sumaNotas/ modulos
                    print("$media ")
                }
            println()
        }
}