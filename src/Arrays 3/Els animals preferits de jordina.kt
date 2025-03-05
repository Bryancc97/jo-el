import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt()
        repeat(casos){
            val array = scanner.nextInt()
            scanner.nextLine()
            val array2 = arrayOfNulls<String>(array -1)
                for (i in 0 until (array -1)){
                    array2[i] = scanner.nextLine()
                }
            val animalb = scanner.nextLine()
            var animalsi = false
                for (animal in array2){
                    if(animalb == animal){
                        animalsi = true
                    }
                }
                if (animalsi){
                    println("SI")
                }else{
                    println("NO")
                }
        }
}