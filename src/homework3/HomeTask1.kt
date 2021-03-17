package homework3

import java.lang.System.`in`
import java.util.*

fun main() {
    val sc = Scanner(`in`)
    println("Enter your number")
    if (sc.hasNext()) {
        for (i in sc.nextInt() downTo 0)
            print( "" + i + ",")


    }

}