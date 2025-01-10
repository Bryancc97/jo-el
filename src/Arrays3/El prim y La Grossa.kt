import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // Leer el número de casos de prueba
    val casos = scanner.nextInt()
        for (i in 1..casos) {
            // Leer el importe disponible de Celia
            val disponible = scanner.nextInt()
            // Crear una lista para almacenar las solicitudes
            val solicitudes = mutableListOf<Int>()
            // Leer las solicitudes hasta encontrar un 0
            var solicitud = scanner.nextInt()
                while (solicitud != 0) {
                    solicitudes.add(solicitud)
                    solicitud = scanner.nextInt()
                }
            // Ordenar las solicitudes
                solicitudes.sort()
            var aceptadas = 0
            var totalDisponible = disponible
                //Aceptar tantas solicitudes como sea posible
                for (solicitud in solicitudes) {
                    if (solicitud <= totalDisponible) {
                        aceptadas++
                        totalDisponible -= solicitud
                    }
                }
            println(aceptadas)
        }
}