fun main() {
    println("Введите 5 чисел")
    var n = 5
    var array = IntArray(n)
    var k = 0
    for (i in 0..4){
        println("Введите a$i элемент: ")
        array[i] = readLine()!!.toInt()
    }
    for (i in 0..4){
        if( array[i]>0 ){
            k++
        }
    }
    println("Кол-во положительных чисел равно: $k")
}