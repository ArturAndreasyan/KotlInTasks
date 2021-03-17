package homework3

import java.lang.System.`in`
import java.util.*

fun main() {
    println("Enter your numbers ")
    sum()
}


fun sum() {
    val sc = Scanner(`in`)
    val scan = Scanner(`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val summ = a + b
    println("Sam of twu numbers is = " + summ)
    println("Are you wish continue?")
    println("If yes enter number 1,else any another number")
    val choice = Scanner(`in`)
    if (choice.nextInt() == 1) {
        println("Enter your numbers")
        sum()
    } else {
        return
    }

}