package homework1


fun main() {
    println("Введите 2 числа")
    val number1: Int = readln().toInt()
    val number2: Int= readln().toInt()
    for (i in number1..number2) {
        println(i)
    }
}


//Пользователь вводит два числа. Вывести все числа расположенные между ними.