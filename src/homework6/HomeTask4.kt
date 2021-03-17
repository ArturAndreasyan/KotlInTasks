package homework6

fun main() {
    var list = mutableListOf<Int>(1,3,2)
    println(listOfSquareElements(list))
}


fun  listOfSquareElements(list : MutableList<Int>) : MutableList<Int>{
    var newList = mutableListOf<Int>()
    for (i in 0 until list.size){
        newList.add(list[i] * list[i])

    }
    return newList
}