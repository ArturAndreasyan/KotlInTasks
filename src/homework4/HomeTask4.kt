package homework4

import java.lang.System.`in`
import java.util.*

fun main() {
var sc = Scanner(`in`)
    var i = sc.nextInt()
    println(fib(i))
}

fun fib(n : Int) : Int{
    if (n == 0){return 0}
    if (n == 1){ return 1}
    else{
       return fib(n -1) + fib(n - 2)
    }
}