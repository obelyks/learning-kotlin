package k014_NullSafety

fun main(args: Array<String>) {
    smartCast()
    assertion()
    eliminateNulls()
}

private fun eliminateNulls() {
    val a: List<Int?> = listOf(1, null, 2, 3, null)
    val b: List<Int> = a.filterNotNull()
    println("filtered: $b")
}

private fun assertion() {
    val message: String? = null
    try {
        println(message!!) //KotlinNullPointerException thrown, app crashes
    } catch (npe: KotlinNullPointerException) {
        npe.printStackTrace()
    }
}

private fun smartCast() {
    var string: String? = "Hello!"
    //print(string.length) // Compile error
    // x for  nullable receiver
    //?. SAFE
    //!!  non-null asserted
    if (string != null) {
        // The compiler now knows that string can't be null
        print(string.length) // It works now!
    }
}