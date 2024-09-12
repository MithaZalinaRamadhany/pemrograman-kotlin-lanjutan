//MITHA ZALINA RAMADHANY
//RPL 5A
fun main(args: Array<String>) {
    var x:Int
    println("Example of Break an Continue in For-Loop")
    for (x in 1..10){
            if (x == 7) break
            if (x == 3) continue
            print("$x ")
    }
    print('\n')
}