package ex17

object ex17_04 {
  def main(args: Array[String]) {
    val p1 = new Student
    val p2 = new Student
    val s1 = new Person
    val pair = new Pair4(p1, p2)
    pair.replaceFirst(s1)
  }
}
/*
class Pair4[T](val first: T, val second: T) {
  // 编译错误，因为required Student， found Person
  def replaceFirst(newFirst: T) = new Pair4[T](newFirst, second)
}
*/

/*
public class Pair4<T>
{
    private final T first;
    private final T second;

    public T first() {
        return this.first;
    }

    public T second() {
        return this.second;
    }

    public <R> Pair4<R> replaceFirst(final R newFirst) {
        return new Pair4<R>(newFirst, this.second());
    }

    public Pair4(final T first, final T second) {
        this.first = first;
        this.second = second;
    }
}
*/
class Pair4[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair4[R](newFirst, second)
}

class Person
class Student extends Person
