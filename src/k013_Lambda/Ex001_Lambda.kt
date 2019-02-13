package k013_Lambda

import java.time.Duration
import java.time.Instant

class User(val age: Int) {}

fun main(args: Array<String>) {
    val MINIMUM_AGE = 10;
    var users: ArrayList<User> = ArrayList()
    //var users2: ArrayList<User>=ArrayList() //pozor na whitespace toto je hcyba nevimproc!!

    //rovnou
    val allowedUsers = users.filter { it.age > MINIMUM_AGE }
    //var
    val isOfAllowedAge = { user: User -> user.age > MINIMUM_AGE }
    val allowedUsers2 = users.filter(isOfAllowedAge)



    //Usage:
    val time = Benchmark.realtime({
        // some long-running code goes here ...

    })
    println("Executed the code in $time")
}

object Benchmark {
    fun realtime(body: () -> Unit): Duration {
        val start = Instant.now()
        try {
            body()
        } finally {
            val end = Instant.now()
            return Duration.between(start, end)
        }
    }
}