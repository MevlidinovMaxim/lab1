import kotlin.math.sqrt
fun main() {
    println("Введите координаты первой вершины")
    var Ax = readLine()!!.toDouble()
    var Ay = readLine()!!.toDouble()
    println("Введите координаты второй вершины")
    var Bx = readLine()!!.toDouble()
    var By = readLine()!!.toDouble()
    println("Введите координаты третей вершины")
    var Cx = readLine()!!.toDouble()
    var Cy = readLine()!!.toDouble()

    var a = sqrt((Bx - Ax)*(Bx - Ax)+(By - Ay)*(By - Ay))
    var b = sqrt((Cx - Bx)*(Cx - Bx)+(Cy - By)*(Cy - By))
    var c = sqrt((Cx - Ax)*(Cx - Ax)+(Cy - Ay)*(Cy - Ay))
    var p = (a + b + c)/2
    var S = sqrt(p*(p-a)*(p-b)*(p-c))
    println("Площадь треугольника равна $S")
}