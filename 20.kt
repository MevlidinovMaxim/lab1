fun main() {
    print("Введите целое число:\n")
    var K = Integer.valueOf(readLine())
    var M = Integer.valueOf(readLine())
    var f = 1
    if(M < 1) {
        print("Ошибка")
        f = 0
    }
    if(f == 1){
        print("Промежуточные числа:\n")
        if(K < 1) {
            K = 1
        }
        for(i in K..M){
            print(i.toString() + " ")
        }
    }
}