package k009_Conditionals

fun main(args: Array<String>) {
    var x="x";

    when (x) {
        "English" -> print("How are you?")
        "German" -> print("Wie geht es dir?")
        else -> print("I don't know that language yet :(")
    }
//The when statement also knows some more advanced matching options:
    val names = listOf("John", "Sarah", "Tim", "Maggie")

    var y:Any=25;
    when (y) {
        in names -> print("I know that name!")
        !in 1..10 -> print("Argument was not in the range from 1 to 10")
        is String -> print(x.length) // Due to smart casting, you can use String-functions here
    }

    val greeting = when (x) {
        "English" -> "How are you?"
        "German" -> "Wie geht es dir?"
        else -> "I don't know that language yet :("
    }
    print(greeting)

    val str = "Hello!"
    if (str.length == 0) {
        print("The string is empty!")
    } else if (str.length > 5) {
        print("The string is short!")
    } else {
        print("The string is long!")
    }

    //var condition=str>"5";
    //var condition:Boolean//TODO kdyz je tam jenom boolean tak se ten if nekompiluje//zze neni inicializovany
    var condition=true

    val str2 = if (condition) "Condition met!" else "Condition not met!"
    var condition1=true
    var condition2=true
    val str3 = if (condition1){
        "Condition1 met!"
    } else if (condition2) {
        "Condition2 met!"
    } else {
        "Conditions not met!"
    }

    //pouziti misto else if branchi!! netreba break jako u case!
    when {
        str.length == 0 -> print("The string is empty!")
        str.length > 5 -> print("The string is short!")
        str.length < 0 -> {
            print("The string is not!")
            print("The string is smallerthan small MULTILINE when condition!")
        }
        else -> print("The string is long!")
    }
}