package homework4

import java.lang.System.`in`
import java.util.*

fun main() {
    var sc = Scanner(`in`)
    eyn()
    var i = sc.nextInt()
    println(factorial(i))

}

fun factorial(n: Int): Int {
    if (n != 1) {
        return n * factorial(n - 1)
    } else {
        return 1
    }


}
