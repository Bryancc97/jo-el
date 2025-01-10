import java.util.*
fun main(){
    var scanner: Scanner = Scanner(System.`in`)
    var numCasos : Int = scanner.nextInt()
        repeat(numCasos){
            //tratar casos
            //Definir lista de letras disponibles
            var letras = IntArray(26)
                //Lista de cuantidad de letras
                for(i in 0..25){
                    letras[i] = scanner.nextInt()
                }
            var listapalabras : MutableList<String> = mutableListOf()
            scanner.nextLine()
            var palabra = scanner.nextLine().uppercase()
                while (palabra != "."){
                    var posible:Boolean = true
                    var copia = letras.clone()
                    for (c in palabra){
                        if (letras[c-'A'] > 0){
                            letras [c-'A'] --
                        }
                        else{
                            posible = false
                        }
                    }
                    if (posible){
                        listapalabras.add(palabra)
                    }
                    else{
                        letras = copia
                    }
                    palabra = scanner.nextLine().uppercase()
                }
            println(listapalabras.size)
            for (palabra in listapalabras){
                println(" $palabra")
            }
            println()
        }
}