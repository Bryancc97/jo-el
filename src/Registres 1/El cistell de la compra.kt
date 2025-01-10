import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.nextLine()
    val productos = mutableListOf<Pair<String, Float>>()
    // Leemos los productos y precios
    for (i in 1..n) {
        val linea = scanner.nextLine().split(" ")
        val nombre = linea[0]
        val precio = linea[1].toFloat()
        productos.add(Pair(nombre, precio))
    }
    // Leemos el número del producto que queremos consultar
    val p = scanner.nextInt()
    val ordenp = productos.sortedByDescending { it.second }
    val masCaro = ordenp.first()
    val masBarato = ordenp.last()
    val buscat = ordenp[p - 1]
    println("EL MES CAR: ${masCaro.first} ${masCaro.second}")
    println("EL MES BARAT: ${masBarato.first} ${masBarato.second}")
    println("EL BUSCAT: ${buscat.first} ${buscat.second}")
}
