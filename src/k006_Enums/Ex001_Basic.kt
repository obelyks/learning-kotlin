package k006_Enums

enum class SimmpleColor {
    RED, GREEN, BLUE
}
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
enum class ColorWithProperties {
    RED {
        override val rgb: Int = 0xFF0000
    },
    GREEN {
        override val rgb: Int = 0x00FF00
    },
    BLUE {
        override val rgb: Int = 0x0000FF
    }
    ;  //MUSI tady byt; oddeluje hodnoty od properties
    abstract val rgb: Int
    fun colorString() = "#%06X".format(0xFFFFFF and rgb)
}

//mutable=singleton
enum class Planet(var population: Int = 0) {
    EARTH(7 * 100000000),
    MARS();
    override fun toString() = "$name[population=$population]"
}

fun main(args: Array<String>) {
    println(Planet.MARS) // MARS[population=0]
    Planet.MARS.population = 3
    println(Planet.MARS) // MARS[population=3]

}