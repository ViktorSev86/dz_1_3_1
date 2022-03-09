fun main() {
    val t = 3600 * 23 * 1
    println("Был(а) " + agoToText(t))
}

fun agoToText(time: Int): String {
    val res = when {
        time < 60 -> "только что"
        time >= 60 && time < 3600 -> minToText(time)
        time >= 3600 && time < 3600 * 24 -> hourToText(time)
        time >= 3600 * 24 && time < 3600 * 24 * 2 -> "сегодня"
        time >= 3600 * 24 * 2 && time < 3600 * 24 * 3 -> "вчера"
        time >= 3600 * 24 * 3 -> "давно"
        else -> "Ошибка!"
    }
    return res
}

fun minToText (time: Int): String {
    val mi: Int = time / 60
    val res = when {
        mi / 10 % 10 == 1 -> "$mi минут назад"
        mi % 10 == 1 -> "$mi минуту назад"
        mi % 10 == 2 || mi % 10 == 3 || mi % 10 == 4 -> "$mi минуты назад"
        else -> "$mi минут"
    }
    return res
}

fun hourToText (time: Int): String {
    val ho: Int = time / 3600
    val res = when {
        ho / 10 % 10 == 1 -> "$ho часов назад"
        ho % 10 == 1 -> "$ho час"
        ho % 10 == 2 || ho % 10 == 3 || ho % 10 == 4 -> "$ho часа назад"
        else -> "$ho часов назад"
    }
    return res
}