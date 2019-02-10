package k009_Conditionals

enum class Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

fun doOnDay(day: Day) {
    when (day) {
        //Day.Sunday -> print(7)// Do something
        Day.Monday, Day.Tuesday -> print(1)// Do other thing
        Day.Wednesday -> print(1)// ...
        Day.Thursday -> print(1)// ...
        //Day.Friday -> print(1)// ...
        //Day.Saturday -> print(1) // ...
    }
}

//As you can see in second case line ( Monday and  Tuesday ) it is also possible to combine two or more  enum values.
//If your cases are not exhaustive the compile will show an error. You can use  else to handle default cases:
//TODO neni compile error kdyz chybi cases!!!
fun doOnDay2(day: Day) {
    when (day) {
        Day.Monday -> print(1)// Work
        Day.Tuesday -> print(1)// Work hard
        Day.Wednesday -> print(1)// ...
        Day.Thursday -> print(1)//
        Day.Friday -> print(1)//
        else -> print(7)// Party on weekend
    }
}
fun main(args: Array<String>) {
    doOnDay2(Day.Sunday)
    doOnDay(Day.Sunday)

}