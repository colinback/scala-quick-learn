package ex17

object ex17_03 {
  def main(args: Array[String]) {
    val p = new Pair3
    println(p.swap(97 -> 'a'))
  }
}

class Pair3[T, S] {
  def swap[T, S] (p : (T, S)) = {
    (p._2, p._1)
  }
}
