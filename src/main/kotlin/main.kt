import java.util.*

fun main(){
    println("Введите количество человек которым понравилось")
    val scan = Scanner(System.`in`)
    val result: String
    val likes = scan.nextInt() // Ввод количества лайков
    if (likes % 10 === 1){
        result = "человеку"
        println("Понравилось $likes $result")
    } else {
        result = "людям"
        println("Понравилось $likes $result")
    }
}
