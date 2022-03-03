fun main() {
    print("Введите целое число: ")
    var n = Integer.valueOf(readLine())
    var c = 0
    print("Делители: ")
    for(i in 1..n){
        if(n % i == 0){
            print("$i ")
            c += 1
        }
    }
    print("\nВсего делителей: $c")
}
