import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Llegim el nombre de casos de prova
    val casos = scanner.nextInt()
    scanner.nextLine()
    for (i in 1..casos) {
        //Numero de nombres
        val k = scanner.nextInt()
        scanner.nextLine()
        // Lista de los nombres
        val noms = scanner.nextLine().split(" ")
        //Alumno betado
        val alumnobetado = scanner.nextInt()
        scanner.nextLine()
        //Val para betar al alumno
        val resultado = mutableListOf<String>()
        for (index in noms.indices) {
            if (index != alumnobetado) {
                resultado.add(noms[index])
            }

        }
        //Resultado sin alumno
        println(resultado.joinToString(" "))
    }
}
