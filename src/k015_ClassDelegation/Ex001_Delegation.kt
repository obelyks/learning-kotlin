package k015_ClassDelegation

interface Foo {
    fun example()
}
//class Bar {
class Bar :Foo{
    override fun example() {
        println("Hello, world!")
    }
}
class Baz(b : Bar) : Foo by b

//zas takovy zazrat to neni musi implementovat Foo a pouzit override!!!
//casti megaobjektu(spatne) muzou byt slozene v mensich uz implementovanaych
fun main(args: Array<String>) {
    Baz(Bar()).example()
}