fun main() {
    println("Введите числитель")
    var a = readLine()!!.toInt()
    println("Введите знаменатель")
    var b = readLine()!!.toInt()
    if (a>=b){
        println("Дробь неправильная")
    }
    else{
        println("Дробь правильная")
    }

}