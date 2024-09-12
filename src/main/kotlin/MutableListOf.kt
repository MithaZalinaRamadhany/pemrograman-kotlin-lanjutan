//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    //MutableList adalah Daftar dengan operasi penulisan khusus daftar
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("Five")   // this is OK
    //numbersStr = mutableListOf("enam", "tujuh") // kesalahan kompilasi
    println(numbersStr)
}