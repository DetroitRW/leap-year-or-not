import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите год: ")
    val y = reader.nextInt()

    val nonLeap = "Не високосный год"
    val leap = "Високосный год"

    val result = if (y % 400 == 0) {
        leap
    } else if (y % 100 == 0) {
        nonLeap
    } else if (y % 4 == 0) {
        leap
    } else {
        nonLeap
    }
    print("$y - $result")
}