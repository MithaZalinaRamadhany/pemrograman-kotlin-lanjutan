//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    val listNumber = listOf(1,2,3,4,5,6)
    println("Jumlah nilai pada elemen listNumber = ${getSum(listNumber)}")
}

fun getSum(values: List<Int>) : Int { // tipe pengembalian adalah Int
    var total = 0;
    for (i in values) total += i
    return total // pengembalian nilai
}