import java.util.*
fun main(){
    val scanner= Scanner(System.`in`)
    val casos = scanner.nextInt()
        for (o in 0 until casos){
            val nombre1 = scanner.nextInt()

            val numeros = mutableListOf<Int>()
                for (i in 0 until nombre1){
                    numeros.add(scanner.nextInt())
                }
                numeros.sort()
                for (i in 0 until nombre1 / 2){
                    val suma = numeros[i] + numeros[nombre1 -1 -i]
                    println("$suma")
                }
        }
}