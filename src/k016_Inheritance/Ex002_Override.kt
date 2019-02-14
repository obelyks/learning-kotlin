package k016_Inheritance

interface Ship {
    fun sail()
    fun sink()
}

object Titanic : Ship {
    var canSail = true
    override fun sail() {
        sink()
    }

    override fun sink() {
        canSail = false
    }
}

abstract class Car {
    abstract val name: String;
    open var speed: Int = 0;
}

class BrokenCar(override val name: String) : Car() {
    override var speed: Int
        get() = 0
        set(value) {
            throw UnsupportedOperationException("The car is broken")
        }
}

fun main(args: Array<String>) {
    val car: Car = BrokenCar("Lada")
    car.speed = 10
}



