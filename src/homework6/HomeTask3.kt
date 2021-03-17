package homework6

fun main() {
var list = mutableListOf<Int>(7,15,-6)
    println(listOfPositiveElements(list))

}



fun  listOfPositiveElements(list : MutableList<Int>) : MutableList<Int>{
    var newList = mutableListOf<Int>()
    for (i in 0 until list.size){
        if (list[i] > 0){
            newList.add(list[i])

        }
    }

     return newList

}


