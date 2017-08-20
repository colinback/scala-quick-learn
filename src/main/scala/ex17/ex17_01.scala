package ex17

/*
import scala.Tuple2;
import scala.runtime.BoxesRunTime;
import scala.Predef$;
import scala.Predef;

public final class ex17_01$
{
    public static ex17_01$ MODULE$;

    static {
        new ex17_01$();
    }

    public void main(final String[] args) {
        final Pair1 p = new Pair1((Tuple2<T, S>)Predef.ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc((Object)BoxesRunTime.boxToInteger(97)), (Object)BoxesRunTime.boxToCharacter('a')));
        final Tuple2 a = p.swap();
        Predef$.MODULE$.println((Object)a);
    }

    private ex17_01$() {
        ex17_01$.MODULE$ = this;
    }
}

public final class ex17_01
{
    public static void main(final String[] args) {
        ex17_01$.MODULE$.main(args);
    }
}
*/
object ex17_01 {
  def main(args: Array[String]) {
    val p = new Pair1(97 -> 'a')
    val a = p.swap
    println(a)
  }
}

/*
import scala.Tuple2;

public class Pair1<T, S>
{
    private final Tuple2<T, S> p;

    public Tuple2<T, S> p() {
        return this.p;
    }

    public Tuple2<S, T> swap() {
        return (Tuple2<S, T>)new Tuple2(this.p()._2(), this.p()._1());
    }

    public Pair1(final Tuple2<T, S> p) {
        this.p = p;
    }
}
*/
class Pair1[T, S](val p: (T, S)) {
  def swap = {
    (p._2, p._1)
  }
}
