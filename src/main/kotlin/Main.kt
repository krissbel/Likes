fun main() {
    println("Количество лайков")
    val likes = readLine()?.toInt() ?: return
    val lastChar = likes % 10
    if (lastChar == 1)
        println("Понравилось $likes человеку")
    else
        println("Понравилось $likes людям")
}

