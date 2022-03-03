fun main() {
    print("Сколько минут разговариваете в месяц: ")
    var mins = Integer.valueOf(readLine())
    if (mins > 500)
        print(("С вас: ") + ((mins - 500) * 2 + 350) + (" рублей"))
    else {
        print("С вас 350 рублей")
    }
}