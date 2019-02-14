package k016_Inheritance

open class Thing {
    // I can now be extended!
    //final by default
    //podivat se na class delegation! tam je interface
}

open class BaseClass {
    val x = 10
    fun jump() = println("Jumping...")
}

class DerivedClass : BaseClass() {
    fun foo() {
        println("x is equal to " + x)
    }
}

fun main(args: Array<String>) {
    val derivedClass = DerivedClass()
    derivedClass.foo() // prints: 'x is equal to 10'
    derivedClass.jump()
}