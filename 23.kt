fun main() {
    print("Введите число: ")
    var num1 = Integer.valueOf(readLine())
    var i = 2
    var flag = 1
    while(num1 != i){
        if (num1 == 1)
            break
        if(num1%i==0) {
            flag = 0
            break
        }
        i += 1
    }
    if (flag == 1)
        print("Это простое число")
    else {
        print("Это не простое число")
    }
}

