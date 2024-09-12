// MITHA ZALINA RAMADHANY
// RPL 5A
fun main(args: Array<String>) {
    // Membuat Array<String> dengan ukuran 5 dan nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}