fun main() {
    val Ak = 1024
    println("Введите первое число кодового замка: ")
    var a1 = readLine()!!.toInt()
    println("Введите второе число кодового замка: ")
    var a2 = readLine()!!.toInt()
    println("Введите третие число кодового замка: ")
    var a3 = readLine()!!.toInt()
    println("Введите четвёртое число кодового замка: ")
    var a4 = readLine()!!.toInt()
    a1 = a1 * 1000
    a2 = a2*100
    a3 = a3*10
    var Ar = a1 + a2 + a3 + a4
    if (Ar == Ak){
        println("Кодовый замок получилось открыт")
    }
    else{
        println("Кодовый замок не получилось открыть")
    }

}