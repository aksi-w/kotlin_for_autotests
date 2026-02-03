import kotlin.math.max

fun main() {
    /*
    val maxFirstPair = maxOfTwo(3, 7)   //  7
    val maxSecondPair = maxOfTwo(10, 5) //  10
    println(maxOfTwo(maxFirstPair, maxSecondPair)) //10
     */

    /*
    sayHello()
    sayHello("Polina")
     */

    val maxFirstPair = 3 isGreater 7
    val maxSecondPair = 10 isGreater 5
    println("$maxFirstPair, $maxSecondPair")

    // println(generateSequence(6))
    task5()
}

/* Задание 1 Функции и рекурсия:
Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов и возвращает наибольшее число.
Затем, используйте эту функцию для поиска максимального числа из двух разных пар чисел.
*/
fun maxOfTwo(a: Int, b: Int): Int {
    return max(a, b)
}

/* Задание 2 Функции и рекурсия:
Создайте функцию sayHello, которая принимает строковый аргумент name и возвращает приветственное сообщение.
Функция должна иметь параметр по умолчанию "мир". Затем вызовите функцию дважды: с именем и без имени.
*/
fun sayHello(name: String = "World") {
    println("Hello, $name")
}

/* Задание 3 Функции и рекурсия:
Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true, если первое число
больше второго, и false в противном случае. Затем используйте эту функцию, сравнив две пары чисел.
*/
infix fun Int.isGreater1(other: Int): Boolean {
    var flag = false
    if (this > other) {
        flag = true
    }
    return flag
}
infix fun Int.isGreater(other: Int): Boolean {
    return this > other
}

/* Задание 4 Функции и рекурсия:
Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации
*/
tailrec fun generateSequence(n: Int, i: Int = 1) {
    if (i > n){
        return
    }
    println(i)
    generateSequence(n , i+1)
}

/* Задание 5 Функции и рекурсия:
Создайте список имен и используйте функции let, run, also, apply и with для выполнения различных операций
над этим списком (например, добавьте имя, удалите имя, переверните список и т. д.).
*/
fun task5(){
    val names = mutableListOf("Polina", "Vlad", "Kirill", "Masha", "Nastya")

    names.let {
        println(it)
        it.add("Sasha")
    }

    names.also {
        println(it)
        it.remove("Nastya")
    }

    names.run {
        println(this)
        add("Vova")
    }

    names.apply {
        println(this)
        remove("Vlad")
    }

    with(names){
        println(this)
        add("Vlad")
    }
}