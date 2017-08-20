package ex17

/*
import scala.collection.immutable.List;
import scala.collection.Seq;
import scala.collection.Iterable;
import scala.collection.immutable.StringOps;
import scala.Predef$;

public final class ex17_06$
{
    public static ex17_06$ MODULE$;

    static {
        new ex17_06$();
    }

    public void main(final String[] args) {
        final String str = "World";
        Predef$.MODULE$.println((Object)new StringOps(Predef$.MODULE$.augmentString("%s's middle is %c")).format((Seq)Predef$.MODULE$.genericWrapArray((Object)new Object[] { str, this.middle((scala.collection.Iterable<Object>)Predef$.MODULE$.wrapString(str)) })));
    }

    public <T> T middle(final Iterable<T> iter) {
        final List list = iter.toList();
        return (T)list.apply(list.size() / 2);
    }

    private ex17_06$() {
        ex17_06$.MODULE$ = this;
    }
}
*/
object ex17_06 {
  def main(args: Array[String]) {
    val str = "World"
    println("%s's middle is %c".format(str, middle(str)))
  }

  def middle[T](iter: Iterable[T]): T = {
    val list = iter.toList
    list(list.size / 2)
  }
}
