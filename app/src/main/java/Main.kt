
/* Задание 2: “Hello world”
Создайте первую программу на Kotlin, которая выводит “Hello, world!” в консоль.
 */

fun main() {
    println("Hello, World!")
    //variables()
    //operators()
    //print()
}


/* Задание 3: Работа с переменными
Создайте несколько переменных разных типов (например, Int, String, Boolean).
Присвойте им значения и выведите результаты на экран. Попробуйте изменить значения этих переменных и снова выведите результаты.
 */

fun variables() {
    val a: Int = 10
    var b = 2
    val s: String = "Polina"
    val bool: Boolean = true
    println("Before the change: $a, $s, $bool")

    var c = b + 2
    println("After change: $c")
}

/*Задание 4: Работа с операторами
Напишите простые выражения с использованием различных операторов Kotlin (арифметические, сравнения, логические). Выведите результаты на экран.
 */
fun operators() {
    val a = 20
    val b = 2
    val sum = a + b
    val sub = a - b
    val multiplication = a * b
    val division = a / b
    val ost = b % a
    println("Arithmetic operators: $sum, $sub, $multiplication, $division, $ost")

    val equality = b == a // всегда false
    val inequality = a != b
    val less = a < b
    val lessOrMore = b >= a
    println("Logical operators: $equality, $inequality, $less, $lessOrMore")

    var c = 4
    c += 1
    var d = 6
    d -= 1
    var e = 7
    e *= 3
    var f = 8
    f /= 2
    var g = 9
    g %= 2
    println("Assignment operators: $c, $d, $e, $f, $g")
}

/**Задание 5: Комментарии и стандартный ввод/вывод
Добавьте комментарии к коду в ваших предыдущих заданиях. Используйте и однострочные, и комментарии документации.
Создайте новую программу, которая запрашивает у пользователя ввод из консоли, сохраняет его в переменную и затем выводит
эту переменную на экран.
 */
fun print() {
    println("Enter your name")
    val a = readLine()
    println("Hello $a!")
}


//fun task1() {
//    val name: String = "Polina"
//    val age: Int = 21
//    val height: Double = 1.70
//    val isStudent: Boolean = true
//    println("$name $age $height $isStudent")
//}
//
//fun task2() {
//    val a = 10
//    val b = 3
//    var sum = a + b
//    var diff = a - b
//    var mult = a * b
//    println("$a + $b = $sum")
//    println("$a - $b = $diff")
//    println("$a * $b = $mult")
//}
//
//fun task4() {
//    val temperature = 25
//    if (temperature < 0) {
//        println("Мороз")
//    } else if (temperature <= 20) {
//        println("Прохладно")
//    } else {
//        println("Тепло")
//    }
//}
//
//fun task5() {
//    val temperature = 25
//    when {
//        temperature < 0 -> println("moroz")
//        temperature <= 20 -> println("prohladno")
//        else -> println("teplo")
//    }
//}
//
//fun task6() {
//    var i = 1
//    while (i <= 5) {
//        println(i)
//        i += 1
//    }
//}
//
//fun task7() {
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//}
//
//fun task8() {
//    for (i in 1..10) {
//        if (i == 5)
//            continue
//        println(i)
//    }
//}
//
//fun task9() {
//    var sum = 0
//    val n = arrayOf(1, 2, 3, 4, 5)
//    for (i in n){
//        println(i)
//        sum +=i
//    }
//    println(sum)
//}