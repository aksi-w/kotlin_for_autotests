
fun main() {

    //carTask7()
    task2()

    //println(task3(5) { "$it and ${square(it)}" })
    println(lazyValue)
    println(lazyValue)

    val add = { a: Int, b: Int -> a + b }
    val sub = { a: Int, b: Int -> a - b }
    val mult = { a: Int, b: Int -> a * b }
    val div = { a: Int, b: Int -> a / b }

    println("+: ${calculate(10, 5, add)}")
    println("-: ${calculate(10, 5, sub)}")
    println("*: ${calculate(10, 5, mult)}")
    println("/: ${calculate(10, 5, div)}")

    task10()
}

/** Задание 1. Коллекции и Лямбды
Создайте список чисел от 1 до 10, затем используйте метод filter чтобы оставить только четные числа.
После этого используйте метод map чтобы умножить каждое число на 2.
 */
fun task1() {
    val n = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chet = n.filter { it % 2 == 0 }.map { it * 2 }
    println(chet)
}

/** Задание 2. Коллекции и Лямбды
Создайте список строк [“один”, “два”, “три”, “четыре”, “пять”].
Используйте map чтобы получить длину каждого элемента списка.
 */

fun task2() {
    val numbers = listOf("odin", "dva", "tri", "chetyre", "pyat")
    val len = numbers.map { it.length }
    println(len)
}

/** Задание 3. Коллекции и Лямбды
Напишите функцию высшего порядка, которая принимает два параметра: целое число и функцию,
принимающую целое число и возвращающую строку. Эта функция должна преобразовывать число в строку
с помощью переданной функции и возвращать результат.
 */
fun task3(a: Int, operation: (Int) -> String): String {
    return operation(a)
}


/** Задание 4. Коллекции и Лямбды
Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
Используйте эту лямбда-функцию в другой функции, которая принимает число и возвращает строку,
состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
 */
val square: (Int) -> Int = { a -> a * a }


/** Задание 5. Коллекции и Лямбды
Создайте объект класса Person со свойствами name и age. Создайте список из нескольких таких объектов.
Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */
data class Person55(val name: String, val age: Int)
fun task55() {
    val people = listOf(
        Person55("Polina", 21),
        Person55("Anna", 17),
        Person55("Ivan", 25)
    )

    val adultNames = people
        .filter { it.age > 18 }
        .map { it.name }

    println(adultNames)
}


/** Задание 6. Коллекции и Лямбды
Используя ленивые операции, создайте последовательность чисел от 1 до 1000, затем используйте filter
чтобы оставить только числа, делящиеся на 5, затем map чтобы умножить каждое число на 2, и take чтобы взять
первые 20 элементов этой последовательности.
 */
fun lazyTask6() {
    val result = (1..1000).asSequence()
        .filter { it % 5 == 0 }
        .map { it * 2 }
        .take(20)
        .toList()

    println(result)
}

/** Задание 7. Коллекции и Лямбды
Создайте класс Car с полями make, model и year. Создайте коллекцию из нескольких объектов этого класса
и используйте groupBy чтобы сгруппировать машины по году выпуска.
 */
data class Car7(val make: String, val model: String, val year: Int)

fun carTask7() {
    val cars = listOf(
        Car7("Toyota", "Camry", 2020),
        Car7("BMW", "X5", 2019),
        Car7("Mercedes", "C-Class", 2025),
        Car7("Nissan", "X-trail", 2025),
    )

    val carsByYear = cars.groupBy { it.year }
    println(carsByYear)

}

/** Задание 8. Коллекции и Лямбды
Создайте переменную lazyValue типа String, инициализируемую лениво. Проверьте, что инициализация действительно
происходит только при первом обращении к переменной.
 */
val lazyValue: String by lazy {
    println("Check")
    "Lalalala"
}

/** Задание 9. Коллекции и Лямбды
Создайте функцию высшего порядка calculate, которая принимает два целых числа и функцию операции.
Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
 */
/** Задание 9. Коллекции и Лямбды */

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

/** Задание 10. Коллекции и Лямбды
Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму, минимальное и
максимальное значения.
 */
fun task10(){
    val n = listOf(345, 54, 1, 34, 3, 9)
    val sum = n.fold(0){acc, i -> acc+i}
    val min = n.reduce { acc, i -> if (i < acc) i else acc }
    val max = n.reduce { acc, i -> if (i > acc) i else acc }
    println("Sum: $sum")
    println("Min: $min")
    println("Max: $max")
}

