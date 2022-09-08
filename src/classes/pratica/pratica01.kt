package classes.pratica

class Lamp { // essa classe é criada
    private var isOn: Boolean = false // propriedade (membro de dados)

    // três funções de MEMBRO entre turnOn, turnOff, displayLightStatus
    fun turnOn() { // primeiro membro
        isOn = true
    }

    fun turnOff() { // segundo membro
        isOn = false
    }

    fun displayLightStatus(lamp: String) { // terceiro membro
        if (isOn)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main() {
    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lmap class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}