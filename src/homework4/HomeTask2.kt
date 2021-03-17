package homework4

import java.lang.System.`in`
import java.util.*

fun main() {
    var sc = Scanner(`in`)
    eyn()
    var i = sc.nextInt()
    println("Enter $i numbers")
    val numbers = IntArray(i){ sc.nextInt()}
    for (j in numbers.indices){
        if (numbers[j] % 2 == 0){
            var sum  = numbers[j]
            var summa = sum + numbers[j]
            println(summa)

        }else {
            var sum1 = numbers[j]
            var summa1 = sum1 + numbers[j]
            println(summa1)
        }

    }




}


fun sumOfOddNumber(){

}








fun eyn() {
    println("Enter your number")
}
