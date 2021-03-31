package IO

object Output {
  def show(vector:  Vector[Vector[String]]): Unit = {
    vector.foreach(x => {
      x.foreach(y => print(s"| ${y} "))
      println("|")
    })
    println("-------------")
  }

}
