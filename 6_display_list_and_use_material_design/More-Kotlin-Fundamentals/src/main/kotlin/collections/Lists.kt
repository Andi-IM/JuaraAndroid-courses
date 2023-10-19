package collections

@Suppress("ReplaceGetOrSet")
fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    print(solarSystem.size)

    println()
    println(solarSystem[2])
    println(solarSystem.get(3))

    println()
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    println()

    for (planet in solarSystem) {
        println(planet)
    }

}