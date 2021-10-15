/* using when we will make 4 cases,
the player has 100 total healthPoints, the when will indicate the health level for the player either it's full or good or awful or dead.
 */
fun main() {
    theGame(78, false)
}

fun theGame(healthPoint: Int, isHealing: Boolean = false) {
    when (healthPoint) {
        100 -> println("your health is great")
        in 90..99 -> println("you got few scratches")
        in 75..89 -> {
            if (isHealing) {
                println("you have scratches but you're healing up")
            } else {
                println("you're going to die")
            }
        }
        else -> println("Game Over")
    }
}

