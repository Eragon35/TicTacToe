package IO

object AIInput {
  def input(vector: Vector[Vector[String]]): (Int, Int) = {
    val r = scala.util.Random
    var line = Math.abs(r.nextInt() % 3)
    while (!vector(line).contains(" ")) line = (line + 1) % 3
    var row = Math.abs(r.nextInt() % 3)
    while (vector(line)(row) != " ") line = (line + 1) % 3
    (line, row)
  }
}
