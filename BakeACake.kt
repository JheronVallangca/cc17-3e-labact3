fun main() {
    val CakeCandles = ","
    val CakeCandlesOne = "|"
    val CakeTop = "="
    val CakeBottom = "@"
    val Age = 20
    val layer = 5
    
    printBorder(CakeCandles,Age)
    printBorderOne(CakeCandlesOne,Age)
    printBorderTwo(CakeTop,Age)
    printBorderThree(CakeBottom,layer,Age)

   
}
fun printBorder(CakeCandles:String, Age:Int){
    repeat(Age){
    print(CakeCandles)
    }
    println()
}

fun printBorderOne(CakeCandlesOne:String, Age:Int){
    repeat(Age){
    print(CakeCandlesOne)
    }
    println()
}

fun printBorderTwo(CakeTop:String, Age:Int){
    repeat(Age){
    print(CakeTop)
    }
    println()
}

fun printBorderThree(CakeBottom:String, layer:Int ,Age:Int){
    repeat(layer){
        repeat(Age){
    print(CakeBottom)
        }
        println()
}
}