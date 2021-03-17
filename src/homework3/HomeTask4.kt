package homework3

import java.lang.System.`in`
import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

fun main() {
exp()
}

fun exp() {
    val guessNumber = Random.nextInt(21)
    println("Welcome !!! ")
    val scanner = Scanner(System.`in`)
    var numberIsNotGuessed = true
    while (numberIsNotGuessed) {
        println("Guess number")
        val num = scanner.nextInt()
        when {
            num > guessNumber -> {
                println("Go lower")
            }
            num < guessNumber -> {
            }
            else -> {
                println("Get higher")
            }
        }
    }
    println("Game is End !!!! ")
}
