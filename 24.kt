fun main() {
    print("Введите номер топлива (92, 95, 98, 90(дизель): ")
    var type = Integer.valueOf(readLine())
    print("Сколько литров: ")
    var size = Integer.valueOf(readLine())
    if(type == 90)
        print("Стоимсоть " +  (size * 53).toString() + " р")
    else if(type == 92)
        print("Стоимсоть " +  (size * 48).toString() + " р")
    else if(type == 95)
        print("Стоимсоть " +  (size * 51).toString() + " р")
    else if(type == 98)
        print("Стоимсоть " +  (size * 57).toString() + " р")
    else {
        print("Ошибка")
    }
}

