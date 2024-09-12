//MITHA ZALINA RAMADHANY
//RPL 5A
fun main() {
    //Set<T> menyimpan elemen yang unik; urutannya umumnya tidak ditentukan.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of Elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //Implementasi default Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    val strings = hashSetOf("a", "b", "c")  //hash set value unik
    println("My set values are"+strings)

}