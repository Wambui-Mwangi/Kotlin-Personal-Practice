fun main (){
//println(squareSum(2,3, 4))
//    println(greeting("Wambui"))
    multiply(1)
    println(twoOldestAges(listOf(34, 45, 67, 89, 90)))
}
//fun squareSum (num1 : Int, num2 : Int, num3: Int) :Int{
//    val sq = (num1*num1) + (num2*num2) + (num3*num3)
//    return sq
//}
//
//fun greeting (name:Int) :Int {
//    var fullgreeting =
//    return fullgreeting
//}

fun multiply(num1: Int) {
//return num1
    if (num1 %2 == 0) {
        var me = num1 * 8
        println(me)
    }
    else {
        var multi = num1 * 9
        println(multi)

    }
}fun twoOldestAges(ages:List<Int>):List<Int>{
    return ages.sorted().takeLast(2)
}
