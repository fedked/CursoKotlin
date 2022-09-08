package RT

fun main() {

    //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/    val arrayNum = arrayOf(1, 2, 3, 4)
    val arrayNum2 = arrayOf<Int>(1, 2, 3, 4)

    val arrayTest = intArrayOf(0,10,22,33,58,65,12)
    println("Size: ${arrayTest.size}")
    println("Count: ${arrayTest.count()}")
    println("Get 2: ${arrayTest[2]}")
    println("Get 3: ${arrayTest.get(3)}")

    arrayTest.set(0, 21)
    arrayTest[2] = 35
    println(arrayTest)
    arrayTest.forEach {
        print("$it ")
    }
    println()

    arrayTest[0] = 35
    val newList = arrayTest.distinct()

    newList.forEach {
        print("$it ")
    }
    println()
    println(arrayTest.first())

    val listMap = newList.map {
        it + 5
    }
    listMap.forEach {
        print("$it ")
    }
    println()

    val arrayTest2 = arrayOf("Limão", "Banana", "Abacaxi")

    if("Limão" in arrayTest2)
        println("Tem limão")
    else
        println("Não tem Limão")

    for(x in arrayTest2){
        println(x)
    }
}