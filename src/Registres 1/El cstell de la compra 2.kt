import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.nextLine()
    // Lista de productos con nombre y precio
    val productos = mutableListOf<Pair<String, Float>>()
        // Leer los productos y sus precios
        for (i in 1..n) {
            val linea = scanner.nextLine().split(" ")
            val nombre = linea[0]
            val precio = linea[1].toFloat()
            productos.add(Pair(nombre, precio))
        }
    // Leer el nombre del producto a buscar
    val productoBuscado = scanner.nextLine()
    // Ordenar los productos alfabéticamente
    val ordenAlfabetico = productos.sortedBy { it.first }
    // Buscar el producto en la lista de productos
    val productoEncontrado = productos.find { it.first == productoBuscado }
    if (productoEncontrado != null) {
        // Si encontramos el producto, mostrara su precio
        println("SI, M'HA COSTAT ${productoEncontrado.second}")
        // Comprobar si el producto encontrado no es el primero alfabéticamente
        val indiceAlfabetico = ordenAlfabetico.indexOf(productoEncontrado)
        if (indiceAlfabetico > 0) {
            // Si no es el primero alfabéticamente, mostrar el producto anterior
            val productoAnterior = ordenAlfabetico[indiceAlfabetico - 1]
            println("I TAMBE TINC ${productoAnterior.first} A ${productoAnterior.second}")
        }
    } else {
        // Si no encontramos el producto
        println("NO N'HI HAVIA")
    }
}
