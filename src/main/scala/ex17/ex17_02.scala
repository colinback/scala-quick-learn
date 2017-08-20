package ex17

object ex17_02 {
  def main(args: Array[String]) {
    val p = new Pair2(97 -> 'a')
    p.swap
    println(p.p)
  }
}

class Pair2[T](var p: (T, T)) {
  def swap {
    p = (p._2, p._1)
  }
}
