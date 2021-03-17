package homework3

import java.lang.System.`in`
import java.util.*

fun main() {
    val sc = Scanner(`in`)
    println("Enter your Number")
    if (sc.nextInt() % 2 == 0){
        println("Your number is even")
    }else{
        println("Your number is odd")
    }
}
