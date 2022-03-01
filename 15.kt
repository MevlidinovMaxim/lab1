fun main() {
    println("Введите координаты первой точки: ")
    var Ax = readLine()!!.toDouble()
    var Ay = readLine()!!.toDouble()
    println("Введите координаты второй точки: ")
    var Bx = readLine()!!.toDouble()
    var By = readLine()!!.toDouble()
    var A1 = Ax + Ay
    var A2 = Bx + By
    if (A1 > A2){
        println("Вторая точка ближе к началу координат")
    }
    else{
        println("Первая точка ближе к началу координат")
    }
}