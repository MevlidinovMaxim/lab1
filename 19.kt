fun main() {
    print("Введите возраст: ")
    var num1 = Integer.valueOf(readLine())
    if ((num1 >= 0) and (num1 < 6))
        print("Это дошкольный возраст")
    else if ((num1 > 7) and (num1 < 18))
        print("Это школьный возраст")
    else if ((num1 > 19) and (num1 < 59))
        print("Это средний возраст")
    else if ((num1 > 60) and (num1 < 130))
        print("Это возраст пенсионера")
    else {
        print("Ошибка")
    }
}