package classes.pratica

class ToBeCalled {
    companion object {
        var someInteger: Int = 10
        fun callMe() = println("You are calling me")
    }
}

fun main() {
    println(ToBeCalled.someInteger)
    ToBeCalled.callMe()
}
//val obj = CompanionClass.Companion