class Day1 {
    fun getCalories(aocInput: String?, topElves: Int): Int? {
        return aocInput?.split("\n\n")?.map { calories ->
            calories
                .split("\n")
                .filter { it != "" }
                .sumOf { it.toInt() }
        }?.sortedDescending()?.slice(0 until topElves)?.sum()
    }
}