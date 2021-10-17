import java.util.*

fun main(){
    while (true) {
        println("Введите количество человек которым понравилось")
        val scan = Scanner(System.`in`)
        var result: String
        val likes = scan.nextInt() // Ввод количества лайков
        if (((likes/10) % 10) === 1) {
            result = "людям"
            println("Понравилось $likes $result")
        } else if (likes % 10 === 1) {
            result = "человеку"
            println("Понравилось $likes $result")
        } else {
            result = "людям"
            println("Понравилось $likes $result")
        }
    }
}
