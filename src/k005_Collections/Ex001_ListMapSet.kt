package k005_Collections

fun main(args: Array<String>) {
    //mutable vs immutable!

    // Create a new read-only List<String>

    val list = listOf("Item 1", "Item 2", "Item 3")
    println(list) // prints "[Item 1, Item 2, Item 3]"

    // Create a new read-only Map<Integer, String>
    val map = mapOf(Pair(1, "Item 1"), Pair(2, "Item 2"), Pair(3, "Item 3"))
    println(map) // prints "{1=Item 1, 2=Item 2, 3=Item 3}"

// Create a new read-only Set<String>
    val set = setOf(1, 3, 5)
    println(set) // prints "[1, 3, 5]" //TODO jak poznam set??? ve println??
}