fun main() {
    var m1 = arrayOf(1,3,5,7,8,10,12)
    var m2 = arrayOf(4,6,9,11)
    print("Введите день: ")
    val day = Integer.valueOf(readLine())
    print("Введите месяц: ")
    val month = Integer.valueOf(readLine())
    if (month in m1) {
        if ((day < 32) and (day >> 0))
            print("Такая дата существует")
        else {
            print("Такая дата не существует")
        }
    }
    else if (month in m2){
        if ((day < 31) and (day >> 0))
            print("Такая дата существует")
        else {
            print("Такая дата не существует")
        }
    }
    else if (month == 2) {
        if ((day < 30) and(day >> 0))
            print("Такая дата существует")
        else {
            print("Такая дата не существует")
        }
    }
}