package homework1

fun main() {
    val list = listOf(1, -1, 5, -6, -8, 15, 2, 5, -4, 8, 26)

    var number: Int = 0

    list.forEach {
        if (it > 0 && it % 2 == 0) {
            number = number + it
        }
    }
    println(number)
}

//Дан список:      val list = listOf(1, -1, 5, -6, -8, 15, 2, 5, -4)
//Найти сумму всех положительных четных чисел в нем
