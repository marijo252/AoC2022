class Day2 {
    fun totalScore(aocInput: String?): Int? {
        val opponent = mapOf(
            "A" to RockPaperScissors.Rock,
            "B" to RockPaperScissors.Paper,
            "C" to RockPaperScissors.Scissors,
        )

        val response = mapOf(
            "X" to RockPaperScissors.Rock,
            "Y" to RockPaperScissors.Paper,
            "Z" to RockPaperScissors.Scissors,
        )

        val test = aocInput?.split("\n")?.map { round ->
            val match = round.split(" ")
            var score = 0
            if (opponent[match[0]] == response[match[1]]) {
                //score +=
            }

        }

//        A -> Rock
//        B -> Paper
//        C -> Scissors
//
//        X -> Rock
//        Y -> Paper
//        z -> Scissors

    }

    enum class RockPaperScissors {
        Rock,
        Paper,
        Scissors,
    }
}