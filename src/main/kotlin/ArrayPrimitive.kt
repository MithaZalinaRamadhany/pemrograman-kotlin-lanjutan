//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')

    // Array int berukuran 5 dengan nilai [0, 0, 0, 0, 0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

    // misalnya menginisialisasi nilai dalam array dengan konstanta
    // Array int berukuran 5 dengan nilai [42, 42, 42, 42, 42]
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

    // misalnya menginisialisasi nilai dalam array menggunakan lambda
    // Array int berukuran 5 dengan nilai [0, 1, 2, 3, 4] (nilai diinisialisasi ke nilai indeksnya)
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}