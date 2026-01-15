
fun main(){
    taska3()


    println("Enter")
    val userInput = readlnOrNull()

    try {
        validateInput(userInput)
        println(userInput)
    } catch (e: InvalidUserInputException) {
        println("Error: ${e.message}")
    }
}

/*Задание 1. null-safety
Вам дан код: val a: String? = null. Каковы способы, которыми вы
можете обратиться к a без вызова исключения NullPointerException?
 */
/** ОТВЕТ
//val a: String? = null
//val b = a?.length //через ?.
//val c: Int = a?.length ?: 0 //через оператор elvis ?:
//val d: Int = a!!.length  // через утверждение Not-null !!
 */

/* Задание 2. null-safety
Рассмотрите следующий код:
fun main() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}
Что будет выведено в результате выполнения этого кода? Почему
 */
/** ОТВЕТ:
Выведет [1,2,4] потому что мы фильтруем список на null через filterNotNull() и оно удаляется
 */

/* Задание 3. null-safety
Вам дан код: var s: String? = null. Преобразуйте его в ненулевое значение с
помощью оператора elvis, чтобы вместо null было значение "empty".

 */
fun taska3(){
    var s: String? = null
    val a: String = s ?: "empty"
    println(a)
}



/* Задание 4. null-safety
Создайте функцию, которая принимает nullable параметр и использует оператор !! для
преобразования его в ненулевое значение. Что произойдет, если вы вызовете эту функцию с null?
 */
fun pupupy(value: String?): String {
    return value!!
}
// при вызове с null кинется ошибка NullPointerException, Not-null оператор делает значение принулительно не null, если значение равно null , то будет ошибка

/* Задание 5. null-safety
Создайте пользовательское исключение InvalidUserInputException, которое выбрасывается, когда пользователь
вводит что-то неверное. Покажите, как его можно перехватить и обработать.
 */
class InvalidUserInputException(message: String) : Exception(message)

fun validateInput(input: String?) {
    if (input.isNullOrBlank()) {
        throw InvalidUserInputException("ne pysto")
    }
    if (input.length < 3) {
        throw InvalidUserInputException("minimum 3 simvola")
    }
}