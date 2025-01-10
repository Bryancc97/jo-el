import java.util.*

fun main()  {
    var scan : Scanner = Scanner(System.`in`)

    var numCasos : Int = scan.nextInt()

    repeat (numCasos) {
        //tractar cas

        //Definir llista de lletres disponibles
        var lletres = IntArray(26)

        //Carreguem la quantitat de fitxes de cada lletra
        for (i in 0..25) {
            lletres[i] = scan.nextInt()
        }

        var llistaParaulesPossibles : MutableList<String> = mutableListOf()

        scan.nextLine()
        var paraula = scan.nextLine().uppercase()
        while(paraula != ".") {
            //tractar paraula
            var possible:Boolean = true
            var copiaSeguretat = lletres.clone()

            for (c in paraula) {
                if (lletres[c-'A'] > 0) {
                    lletres[c-'A']--
                }
                else
                    possible = false
            }

            if (possible) {
                llistaParaulesPossibles.add(paraula)
            }
            else {
                lletres = copiaSeguretat
            }

            paraula = scan.nextLine().uppercase()
        }

        //Mostrar el resultat
        print(llistaParaulesPossibles.size)
        for (paraula in llistaParaulesPossibles) {
            print(" $paraula")
        }
        println()

    }


}
