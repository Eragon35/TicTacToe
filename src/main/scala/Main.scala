import IO._

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello player\nI want to play a game")
    while (true) {
      var vector = Vector.fill(3, 3)(" ")
      var finish = false
      var winner = ""
      // input data
      while (!finish) {
        val input = ConsoleInput.readCoordinates(vector)
        vector = vector.updated(input._1, vector(input._1).updated(input._2, "X"))
        Output.show(vector) // sout current state
        var checker = Check.isFinish(vector) // check if game is finish
        if (checker != "-1") {
          finish = true
          winner = checker
        }
        if (!finish) { // bot input
          println("AI move:")
          val input2 = AIInput.input(vector)
          vector = vector.updated(input2._1, vector(input2._1).updated(input2._2, "O"))
          Output.show(vector) // sout current state
          checker = Check.isFinish(vector) // check if game is finish
          if (checker != "-1") {
            finish = true
            winner = checker
          }
        }
      }
      if (winner != "draw") println(s"$winner wins")
      else println("Draw")
      // ask if user want to continue game
    }
  }
}
