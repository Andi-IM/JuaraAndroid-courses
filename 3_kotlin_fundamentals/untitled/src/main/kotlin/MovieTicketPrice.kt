fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15 // Children aged 12 or younger
        in 13..60 -> if (isMonday) 25 else 30 // Adults aged 13-60 on Monday
        in 61..100 -> 20 // Seniors aged 61 or older
        else -> -1 // Invalid age
    }
}