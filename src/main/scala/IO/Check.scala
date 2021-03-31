package IO

object Check {
  def isFinish(vector: Vector[Vector[String]]): String = {
    var answer = "-1"
    vector.foreach(x => {
      if ((x(1) == x(0)) && (x(1) == x(2)) && (x(1) != " ")) answer = x(1)
    })
    for (i <- 0 until vector.size) if ((vector(1)(i) == vector(0)(i)) && (vector(1)(i) == vector(2)(i)) && (vector(1)(i) != " ")) answer = vector(1)(i)
    if ((vector(1)(1) == vector(0)(0)) && (vector(1)(1) == vector(2)(2)) && (vector(1)(1) != " ")) answer = vector(1)(1)
    if ((vector(1)(1) == vector(2)(0)) && (vector(1)(1) == vector(0)(2)) && (vector(1)(1) != " ")) answer = vector(1)(1)
    var full = true
    vector.foreach(x => {
      if (x.contains(" ")) full = false
    })
    if (full && (answer == "-1")) answer = "draw"
    answer
  }
}
