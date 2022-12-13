class Day2 {
    fun totalScorePart1(aocInput: String?): Int? {
        val playPoints = mapOf(
            RockPaperScissors.Rock to 1,
            RockPaperScissors.Paper to 2,
            RockPaperScissors.Scissors to 3,
        )

        val matchPoint = mapOf(
            MatchPoint.Win to 6,
            MatchPoint.Lost to 0,
            MatchPoint.Draw to 3,
        )

        return aocInput?.split("\n")?.sumOf { round ->
            round.split(" ").let { play ->
                if (play[0] == "A" && play[1] == "X") {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                } else if (play[0] == "A" && play[1] == "Y") {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else if (play[0] == "A" && play[1] == "Z") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                } else if (play[0] == "B" && play[1] == "X") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                } else if (play[0] == "B" && play[1] == "Y") {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else if (play[0] == "B" && play[1] == "Z") {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                } else if (play[0] == "C" && play[1] == "X") {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                } else if (play[0] == "C" && play[1] == "Y") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                }
            }
        }
    }

    fun totalScorePart2(aocInput: String?): Int? {
        val playPoints = mapOf(
            RockPaperScissors.Rock to 1,
            RockPaperScissors.Paper to 2,
            RockPaperScissors.Scissors to 3,
        )

        val matchPoint = mapOf(
            MatchPoint.Win to 6,
            MatchPoint.Lost to 0,
            MatchPoint.Draw to 3,
        )

        return aocInput?.split("\n")?.sumOf { round ->
            round.split(" ").let { play ->
                if (play[0] == "A" && play[1] == "X") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                } else if (play[0] == "A" && play[1] == "Y") {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                } else if (play[0] == "A" && play[1] == "Z") {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else if (play[0] == "B" && play[1] == "X") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                } else if (play[0] == "B" && play[1] == "Y") {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else if (play[0] == "B" && play[1] == "Z") {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                } else if (play[0] == "C" && play[1] == "X") {
                    matchPoint[MatchPoint.Lost]!!.plus(playPoints[RockPaperScissors.Paper]!!)
                } else if (play[0] == "C" && play[1] == "Y") {
                    matchPoint[MatchPoint.Draw]!!.plus(playPoints[RockPaperScissors.Scissors]!!)
                } else {
                    matchPoint[MatchPoint.Win]!!.plus(playPoints[RockPaperScissors.Rock]!!)
                }
            }
        }
    }

    enum class RockPaperScissors {
        Rock,
        Paper,
        Scissors,
    }

    enum class MatchPoint {
        Win,
        Lost,
        Draw,
    }
}