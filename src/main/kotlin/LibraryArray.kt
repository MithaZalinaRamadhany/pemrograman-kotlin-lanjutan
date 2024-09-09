// MITHA ZALINA RAMADHANY
// RPL 5A
fun main(args: Array<String>) {
    // Creates an Array<String> with sizes 5 and values ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}