package IO

import scala.io.StdIn

object ConsoleInput {
  def readCoordinates(vector: Vector[Vector[String]]): (Int, Int) = {
    print("Input coordinates: ")
    try {
      val input = StdIn.readLine().trim.replaceAll(",",".").split(" ")
      val line = input(0).toInt
      val row = input(1).toInt
      if ((line <= 0) || (line >= 4)) throw IllegalArgumentException("Line should be between 1..3")
      if ((row <= 0) || (row >= 4)) throw IllegalArgumentException("Row should be between 1..3")
      if (vector(line - 1)(row - 1) != " ") throw IllegalAccessException("This cell is already occupaied")
      (line - 1, row - 1)
    } catch {
      case e : Exception => Console.err.println("Reading error: " + e.getMessage)
        readCoordinates(vector)
    }
  }
}
