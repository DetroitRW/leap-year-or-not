import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите год: ")
    val y = reader.nextInt()

    val result = if (y % 4 == 0) {
        "Високосный год"
    } else if (y % 400 == 0) {
        "Не високосный год"
    } else {
        "Не високосный год"
    }
    print("$y - $result")
}