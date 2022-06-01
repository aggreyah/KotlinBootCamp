import java.util.*

fun main(args: Array<String>){
//    println("Hello ${args[0]} World!")
//    val isUnit = println("This is an expression.")
//    println(isUnit)
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//    val message = "The water temperature is ${if (temperature > 50) "too warm." else "Ok."}"
//    println(message)
//    feedTheFish()
//    swim()
//    swim("slow")
//    swim(speed="turtle-like")
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flower pot")
    // eager, creates a new list.
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    val newList = filtered.toList()
//    println("filtered: $filtered")
//    println("new list: $newList")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
//    println("lazy: $lazyMap")
//    println("------")
//    println("first: ${lazyMap.first()}")
//    println("------")
//    println("all: ${lazyMap.toList()}")
    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("------")
    println("filtered: ${lazyMap2.toList()}")
}

fun feedTheFish() {
    val day = randomDay()
    println("Today is $day and the fish eat ${fishFood(day)}")
    println("Change water: ${shouldChangeWater(day)}")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
//    val food: String
    return when (day){
        "Monday" -> "flakes"
//        "Tuesday" -> food = "pellets"
        "Wednesday" -> "redworms"
//        "Thursday" -> food = "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"