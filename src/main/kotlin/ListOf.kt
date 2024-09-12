//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    val numbers =  listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third Element : ${numbers.get(2)}")
    println("Fourth Element : ${numbers[3]}")
    println("Index of Element \\\"two\\\" ${numbers.indexOf("two")}")

    //Elemen daftar (termasuk null) dapat diduplikasi
    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
}

class Person(var name: String, var age: Int){}