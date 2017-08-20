package ex17

object ex17_10 {
  def main(args: Array[String]) {
    val p = new Pair10('b' -> 'a')
    val a = p.swap
    println(a)
  }
}

/*
import scala.Predef;
import scala.Tuple2;

public class Pair10<T, S>
{
    private Tuple2<T, S> p;

    public Tuple2<T, S> p() {
        return this.p;
    }

    public void p_$eq(final Tuple2<T, S> x$1) {
        this.p = x$1;
    }

    public Tuple2<S, T> swap() {
        return (Tuple2<S, T>)new Tuple2(this.p()._2(), this.p()._1());
    }

    public Pair10(final Tuple2<T, S> p, final Predef.$eq$colon$eq<T, S> en) {
        this.p = p;
    }
}
*/
class Pair10[T, S](var p: (T, S))(implicit en: T =:= S) {
  def swap = {
    (p._2, p._1)
    // p = (p._2, p._1)
  }
}
