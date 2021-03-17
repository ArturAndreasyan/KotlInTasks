package homework5

import homework4.eyn
import java.lang.System.`in`
import java.util.*

fun main() {
    var sc = Scanner(`in`)
    eyn()
    var i = sc.nextInt()
    println("Enter $i numbers")
    var numbers = IntArray(i){sc.nextInt()}
    println("input $i;" + Arrays.toString(numbers))
    for (j in numbers.indices){
        if (numbers[j] < 0){
            print("output [ " + numbers[j] + " ]")
            println()
        }

        else
            print("[" + numbers[j] + "]")
    }
}