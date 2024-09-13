//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))
    //Fungsi Lambda
    val mylambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)
    //Fungsi Inline
    myFun(v,mylambda) //meneruskan lambda sebagai parameter fungsi lain
}

fun MyFunction(x: String): String {
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}

fun myFun(a:String, action:(String)->Unit) { //melewati lambda
    print("\nHeyyy!!!")
    action(a)// panggilan ke fungsi lambda
}