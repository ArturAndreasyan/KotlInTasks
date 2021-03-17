package homework6

fun main() {
    var firstSet = setOf<Int>(5,7,15)
    var secondSet = setOf<Int>(6,8,15)
    var list = (firstSet + secondSet).toList()
    println(list)
}