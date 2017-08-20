package ex17

object ex17_11 {
  def main(args: Array[String]) {
    val p1 = new Student
    val p2 = new Student
    val pair = new Pair11(p1, p2)
    makeFriends(pair)
  }

  //如果不定义协变[+T]，编译报错required: Person，found: Student
  def makeFriends(p: Pair11[Person]) {}
}

/*
public class Pair11<T>
{
    private final T first;
    private final T second;

    public T first() {
        return this.first;
    }

    public T second() {
        return this.second;
    }

    public Pair11(final T first, final T second) {
        this.first = first;
        this.second = second;
    }
}
*/
class Pair11[+T](val first: T, val second: T)
