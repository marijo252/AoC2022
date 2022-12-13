class AocHelper {
    fun getAoCInput(day: Int): String? {
        return this::class.java.getResource("inputDay$day.txt")?.readText()
    }
}

fun main() {
    val helper = AocHelper()
    println("result Day 1 part 1 = ${Day1().getCalories(aocInput = helper.getAoCInput(1), topElves = 1)}")
    println("result Day 1 part 2 = ${Day1().getCalories(aocInput = helper.getAoCInput(1), topElves = 3)}")

    println("result Day 2 part 1 = ${Day2().totalScorePart1(aocInput = helper.getAoCInput(2))}")
    println("result Day 2 part 2 = ${Day2().totalScorePart2(aocInput = helper.getAoCInput(2))}")
}