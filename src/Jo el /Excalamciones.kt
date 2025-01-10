package `Jo el `

import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    var bucfin = true
    while (bucfin) {
        val line = scanner.nextLine()

        if (line =="FIN") {
            bucfin = false
        } else {
                var openBrackets = 0
                var closedBrackets = 0

                for (char in line) {
                    if (char == '!') {
                        openBrackets++
                    } else if (char == '¡') {
                        closedBrackets++
                    }
                }
                if (openBrackets == closedBrackets) {
                    println("SI")
                } else {
                    println("NO")
                }
            }
    }
}