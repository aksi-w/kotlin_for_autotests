
fun main() {
    //check()
    //checkWithWhen()
    task4b()
}

/* Задание 1 Условные операторы:
Напишите программу, которая принимает целое число от пользователя и проверяет, является ли оно положительным, отрицательным или нулем.
Используйте различные варианты условных операторов (if, if-else, when).
*/

fun check() {
    println("Enter a number")
    val input = readlnOrNull()
    val a = input?.toIntOrNull()

    if (a == null) {
        println("Error")
    } else if (a > 0) {
        println("The number is positive")
    } else if (a < 0) {
        println("The number is negative")
    } else {
        println("This is zero")
    }
}

fun checkWithWhen() {
    println("Enter a number")
    val input = readlnOrNull()
    val a = input?.toIntOrNull()

    when {
        a == null -> println("Error")
        a > 0 -> println("The number is positive")
        a < 0 -> println("The number is negative")
        else -> println("This is zero")
    }
}

/* Задание 2.а Циклы:
Создайте массив из 10 чисел. Напишите цикл for, который будет выводить каждое число и его квадрат.
После этого напишите цикл while, который будет выводить каждое число и его куб.
*/
fun task2a() {
    val m = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var k = 0
    for (i in m) {
        k = i * i
        println("i and i^2: $i, $k")
    }
    var i = 0
    var n = 0
    while (i < m.size) {
        n = m[i]
        k = m[i] * m[i] * m[i]
        println("i and i^3: $n, $k")
        i += 1
    }
}

/* Задание 2.b Циклы:
Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.
*/
fun task2b() {
    repeat(10) {
        println("Hello, World")
    }
}

/* Задание 3.a Return, Break, Continue:
Напишите функцию, которая принимает массив чисел и возвращает сумму только тех чисел, которые больше 10.
Если обнаруживается число меньше 0, функция должна немедленно прекратить обработку и вернуть текущую сумму (используйте return).
*/
fun task3a() {
    val m = arrayOf(1, 20, 13, 0, 13, 6, -27, 8)
    var sum = 0
    for (i in m) {
        if (i > 10) {
            sum += i
        } else if (i < 0) {
            return println(sum)
        }
    }
    return println(sum)
}

/* Задание 3.b Return, Break, Continue:
Напишите цикл, который выводит числа от 1 до 10, но пропускает числа 3 и 7 (используйте continue).
*/
fun task3b() {
    val m = arrayOf(1, 3, 13, 7, 13, 6, 7, -8)
    for (i in m) {
        if (i == 3 || i == 7) {
            continue
        }
        println(i)
    }
}

/* Задание 3.c Return, Break, Continue:

Вам дана двумерная матрица целых чисел и целевое число. Напишите программу на Kotlin, чтобы искать целевое число в матрице.
Если целевое число найдено, выведите его позицию (строка и столбец) и завершите выполнение циклов;
если не найдено, выведите сообщение об этом. (используйте break). Целевое значение должно вводиться пользователем.
*/
fun task3c() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
        arrayOf(16, 17, 18, 19, 20),
        arrayOf(21, 22, 23, 24, 25)
    )
    val input = readlnOrNull()
    val a = input?.toIntOrNull()
    var found = false
    search@ for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == a) {
                println("Row: $i, Column: $j")
                found = true
                break@search
            }
        }

    }
    if (!found) {
        println("Ne naideno")
    }
}

/* Задание 4.a Обработка исключений:
Напишите программу, которая просит пользователя ввести целое число. Если пользователь вводит что-то другое,
отлавливайте исключение и выводите сообщение об ошибке. Блок finally должен выводить сообщение “Конец программы”.
*/
fun task4a() {
    try {
        println("Enter a number")
        val input =readLine()
        val a = input?.toInt()
    } catch (e: Exception) {
        println("Error $e")
    } finally {
        println("End of program")
    }
}

/* Задание 4.b Обработка исключений:
Создайте ситуацию, где может возникнуть исключение (например, обращение к несуществующему элементу массива или деление на ноль),
и обработайте это исключение, выводя стек вызовов.
*/
fun task4b() {
    try {
        val numbers = arrayOf(1, 2, 3)
        // println(numbers[5])
        val x = 10 / 0
    } catch (e: Exception) {
        println("Exception: $e")
        e.printStackTrace()
    }
}
