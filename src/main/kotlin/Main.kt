import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите год: ")
    val y = reader.nextInt()

    val result = if (y % 4 == 0) {
        "Високостный год"
    } else if (y % 400 == 0) {
        "Не високостный год"
    } else {
        "Не високостный год"
    }
    print(result)
}