
fun main() {
    /* задание 1
     val car1 = Car("Nissan", "Red", 2020)
     car1.drive()
     val car2 = Car("Toyota", "Blue", 2021)
     car2.drive()
     */

    /* Задание 2
    val days = DayOfWeek.values()
    for (day in days){
        println(day.name)
    }
     */

    //Singleton.printMessage() - задание 3

    //Задание 4
    val person = Person("Polina", 21)
    println(person.getName())
    println(person.getAge())
    // println(person.name) // ошибка тк приватная переменная

    /* Задание 5
    val person5 = Person5()
    println(person5.name)
    println(person5.age)
    person5.name = "Dima"
    person5.age = 26
    println(person5.age)
    person5.age = -26
*/

    /*Задание 6
    val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()
     */

    /*Задание 7
    val mathUtils = MathUtils()
    println(mathUtils.add(1,2, 6))
    println(mathUtils.add(2 , 1))
     */

    // Задание 8
    val circle = Circle(3.0)
    println(circle.area())
    val rectangle = Rectangle(2.0, 3.0)
    println(rectangle.area())

    /* Задание 9
    val bird = Bird()
    bird.fly()
    bird.navigate()

    val airplane = Airplane()
    airplane.fly()
    airplane.navigate()
     */

    /*Задание 10
    val user = User("Polina", 21)
    user.printInfo()
     */

    //Задание 11
    val res1 = calculate(Add, 10, 5)
    println(res1)
    val res2 = calculate(Divide, 10, 5)
    println(res2)


    //Задание 12
    val bat = Bat()
    bat.performBreastfeed()
    bat.performFly()


    /*Задание 13
    val engine = Engine()
    val tires = Tires()
    val car = Car13(engine, tires)
    car.drive()
     */

    val a = UserRepository()
    val user1 = User("Polina", 20)
    val user2 = User("Masha", 21)
    a.save(user1)
    a.save(user2)
    println("Users: ${a.getAll()}")
    a.delete(user2)
    println("Users: ${a.getAll()}")

}


/** Задание 1. ООП
Создайте класс Car с полями model, color, year и методом drive(). Создайте несколько объектов этого класса
и вызовите их метод drive().
 */
class Car(var model: String, var color: String, var year: Int) {
    fun drive() {
        println("Driving")
    }
}

/** Задание 2. ООП
Создайте enum class DayOfWeek, содержащий все дни недели. Выведите все дни недели,
используя свойства values и name этого enum.
 */
enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

/** Задание 3. ООП
Создайте объект Singleton с методом printMessage(), который выводит любое сообщение. Вызовите этот метод.
 */
object Singleton {
    fun printMessage() {
        println("Hello, lalalala")
    }
}

/** Задание 4. ООП
Создайте класс Person с приватными свойствами name, age и публичными методами getName() и getAge().
Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */
class Person(private val name: String, private val age: Int) {
    fun getName(): String {
        return name
    }
    fun getAge(): Int {
        return age
    }
}

/** Задание 5. ООП
В классе Person добавьте custom геттеры и сеттеры для свойств name и age. Убедитесь, что вы можете
управлять доступом к этим свойствам извне класса. Например, вы можете реализовать проверку возраста
в сеттере, чтобы убедиться, что возраст неотрицательный.
 */
class Person5 () {
    var name: String = "Polina"
    var age: Int = 21
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Error")
            }
        }
}

/** Задание 6. ООП
Создайте класс Animal с методом makeSound(), затем создайте классы Dog и Cat, наследующие от Animal, и
переопределите метод makeSound(). Создайте объекты Dog и Cat и вызовите их методы makeSound().
 */
open class Animal {
    open fun makeSound() {
        println("Sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Gav")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Meow")
    }
}

/** Задание 7. ООП
Создайте класс MathUtils и перегрузите функцию add(), чтобы она могла принимать два или три целых числа.
 */
class MathUtils {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

/** Задание 8. ООП
Создайте абстрактный класс Shape с абстрактным методом area(), затем создайте классы Circle и Rectangle,
реализующие этот метод. Создайте объекты Circle и Rectangle и выведите их площадь.
 */
abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

/** Задание 9. ООП
Создайте интерфейс Flyable с методом fly() и интерфейс Navigable  с методом navigate(),
затем создайте классы Bird и Airplane, реализующие эти интерфейсы. Создайте объекты Bird и Airplane и
вызовите их методы fly() и navigate().
 */
interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird : Flyable, Navigable {
    override fun fly() {
        println("fly")
    }

    override fun navigate() {
        println("navigate")
    }
}

class Airplane : Flyable, Navigable {
    override fun fly() {
        println("Airplane fly")
    }

    override fun navigate() {
        println("Airplane navigate")
    }
}

/** Задание 10. ООП
Создайте data class User с двумя свойствами и методом printInfo(), который выводит информацию о пользователе.
Создайте объект User и вызовите его метод printInfo().
 */
data class User(val name: String, val age: Int) {
    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}


/** Задание 11. ООП
Создайте sealed class MathOperation и несколько объектов, представляющих различные математические
операции (например, Add, Subtract, Multiply, Divide). Создайте функцию, которая принимает
MathOperation и два числа, и выполняет соответствующую операцию.
 */
sealed class MathOperation
object Add : MathOperation()
object Subtract : MathOperation()
object Multiply : MathOperation()
object Divide : MathOperation()

fun calculate(operation: MathOperation, a: Int, b: Int): Int = when(operation) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
    is Divide -> a / b
}


//sealed class MathOperation {
//    abstract fun matan(a: Int, b: Int): Int
//
//    object Add : MathOperation() {
//        override fun matan(a: Int, b: Int): Int {
//            return a + b
//        }
//    }
//
//    object Subtract : MathOperation() {
//        override fun matan(a: Int, b: Int): Int {
//            return a - b
//        }
//    }
//
//    object Multiply : MathOperation() {
//        override fun matan(a: Int, b: Int): Int {
//            return a * b
//        }
//    }
//
//    object Divide : MathOperation() {
//        override fun matan(a: Int, b: Int): Int {
//            return a / b
//        }
//    }
//}
//
//fun calculate(operation: MathOperation, a: Int, b: Int): Int {
//    return operation.matan(a, b)
//}

/** Задание 12. ООП
Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(), а в классе
CanFly - метод fly(). Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции).
 */
/*
class Mammal {
    fun breastfeed() {
        println("breast feed")
    }
}

class CanFly {
    fun fly() {
        println("Fly")
    }
}

class Bat {
    private val mammal = Mammal()
    private val flyBehavior = CanFly()

    fun breastfeed() {
        mammal.breastfeed()
    }

    fun fly() {
        flyBehavior.fly()
    }
}
 */
interface MammalBehavior {
    fun breastfeed()
}

interface FlyBehavior {
    fun fly()
}

class BatMammalBehavior : MammalBehavior {
    override fun breastfeed() {
        println("eat")
    }
}

class BatFlyBehavior : FlyBehavior {
    override fun fly() {
        println("fly")
    }
}

class Bat {
    private val mammalBehavior: MammalBehavior = BatMammalBehavior()
    private val flyBehavior: FlyBehavior = BatFlyBehavior()

    fun performBreastfeed() {
        mammalBehavior.breastfeed()
    }

    fun performFly() {
        flyBehavior.fly()
    }
}

/** Задание 13. ООП
Создайте классы Engine и Tires. Затем создайте класс Car, который получает
Engine и Tires через конструктор (Dependency Injection).
 */
class Engine {
    fun start() {
        println("start")
    }
}

class Tires {
    fun inflate() {
        println("in flate")
    }
}

class Car13(private val engine: Engine, private val tires: Tires) {
    fun drive() {
        engine.start()
        tires.inflate()
        println("vrum vrum")
    }
}


/** Задание 14. ООП
Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения (save(item: T)),
удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */

interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

class UserRepository : Repository<User> {
    val users = mutableListOf<User>()
    override fun save(item: User) {
        users.add(item)
    }

    override fun delete(item: User) {
        users.remove(item)
    }

    override fun getAll(): List<User> {
        return users.toList()
    }
}