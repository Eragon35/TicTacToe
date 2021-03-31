import IO.Output


object Main {

  def main(args: Array[String]): Unit = {
    println("Hello player\nI want to play a game")
    println(msg)
    while (true){
      // begin game
      val vector = Vector.fill(3, 3)(" ")
      Output.show(vector)
      // input data
      // check if game is finish
      // sout current state
      // bot input
      // check if game is finish
      // sout current state

      // when game is over ask if user want to continue game
    }
  }

  def msg = "I was compiled by dotty :)"

}
