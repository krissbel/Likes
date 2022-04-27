fun main() {
    println("Количество лайков")
    val likes = readLine()?.toInt() ?: return
    if ((likes % 100 == 11) || (likes % 10 in 2..9) || (likes % 10 == 0)) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку ")
    }
}

