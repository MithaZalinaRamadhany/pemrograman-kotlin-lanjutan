//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>){
    //Inisialisasi sebuah arrray 2D
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }

    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

    //Mengisi dengan data
    cinema[2][2] = 1
    for (i in 1..3) {
        cinema[3][i] = 1
    }
    for (i in 0..4) {
        cinema[4][i] = 1
    }

    println()
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}