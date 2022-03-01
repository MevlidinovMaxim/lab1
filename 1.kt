import kotlin.math.*
fun main() {
    print("Площадь квадрата равна: ")
    val square = readLine()!!.toDouble()
    print("Площадь круга равна: ")
    val circle = readLine()!!.toDouble()
    val diametr = 2 * sqrt(circle / 3.142)
    val side = sqrt(square.toDouble())
    if (side > diametr) println("Круг поместится") else
        println ("Круг не поместится")
}