package k012_Regex

fun main(args: Array<String>) {
    val regex1 = Regex(pattern = "c|d")
    val matched = regex1.containsMatchIn(input = "abc")
    println("matched $regex1 = $matched")

    nullsafety()
    finds()
    matches()

    //split
    val a = Regex("""\d+""").split("ab12cd34ef") // a: [ab, cd, ef]
    val b = Regex("""\d+""").split("This is a test") // b: [This is a test]
    println("split a=$a b=$b")

    //replace
    val result = Regex("""\d+""").replace("ab12cd34ef", "x")
    println("split result= $result")

}

private fun matches() {
    //matchEntire
    val a = Regex("""\d+""").matchEntire("100")?.value // a: 100
    val b = Regex("""\d+""").matchEntire("100 dollars")?.value // b: null
    println("match a=$a b=$b")
    //matches
    val regex = Regex(pattern = """\d+""")
    val a1 = regex.matches(input = "50") // => true
    val b1 = regex.matches(input = "50 dollars") // => false
    println("match a=$a1 b=$b1")
    //containsMatchIn
    val c2 = Regex("""\d+""").containsMatchIn("50") // => true
    val a2 = Regex("""\d+""").containsMatchIn("50 dollars") // => true
    val b2 = Regex("""\d+""").containsMatchIn("Fifty dollars") // => false
    println("match c=$c2 a=$a2 b=$b2")
}

private fun finds() {
    //find
    val phoneNumber: String? = Regex(pattern = """\d{3}-\d{3}-\d{4}""")
        .find(input = "phone: 123-456-7890, e..")?.value // phoneNumber: 123-456-7890
    println(phoneNumber)

    //findall
    val matchedResults = Regex(pattern = """\d+""").findAll(input = "ab12cd34ef")
    val result = StringBuilder()
    for (matchedText in matchedResults) {
        result.append(matchedText.value + ",")
    }
    println(result) // => 12 34
}

fun nullsafety() {
    val matchResult = Regex("c|d").find("efg") // matchResult: null
    val a = matchResult?.value // a: null
    val b = matchResult?.value.orEmpty() // b: ""
    println("a? = ${a?.toUpperCase()}") // Still needs question mark. => null
    println("b = ${b.toUpperCase()}")
    try {
        println("a!! = ${a!!.toUpperCase()}")
    //}catch(KotlinNullPointerException npe){ //toto je java!
    }catch(npe: KotlinNullPointerException ){ //kotlin naopak
        println(npe)
        npe.printStackTrace()
    }

}
