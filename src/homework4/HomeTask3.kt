package homework4

import java.lang.System.`in`
import java.util.*

fun main() {
    var sc = Scanner(`in`)
    val numbers = IntArray(3){sc.nextInt()}
    for (element in numbers){
        when(element){
            in 89 .. 100 -> println("Grade A")
            in 69 .. 90 -> println("Grade B")
            in 49 .. 70 -> println("Grade C")
            else -> println("Grade F")
        }
    }

}