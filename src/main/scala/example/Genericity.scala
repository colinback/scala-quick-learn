package example

/*
target/scala-2.12/classes/example/Person.class
public class Person
{
    private final String name;

    public String name() {
        return this.name;
    }

    public Person(final String name) {
        this.name = name;
    }
}
*/
class Person(val name: String)

/*
target/scala-2.12/classes/example/Student.class
public class Student extends Person
{
    public Student(final String studentName) {
        super(studentName);
    }
}
*/
class Student(studentName: String) extends Person(studentName)


/*
target/scala-2.12/classes/example/Genericity$.class
import java.lang.invoke.SerializedLambda;
import scala.reflect.ClassTag$;
import scala.Array$;
import scala.collection.mutable.ArrayOps;
import scala.Predef$;

public final class Genericity$
{
    public static Genericity$ MODULE$;

    static {
        new Genericity$();
    }

    public void test(final Person[] array) {
        Predef$.MODULE$.println((Object)new ArrayOps.ofRef(Predef$.MODULE$.refArrayOps((Object[])new ArrayOps.ofRef(Predef$.MODULE$.refArrayOps((Object[])array)).map(x$1 -> x$1.name(), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply((Class)String.class))))).mkString(" "));
    }

    public void main(final String[] args) {
        this.test(new Person[] { new Person("Mike"), new Student("Nigel") });
    }

    private Genericity$() {
        Genericity$.MODULE$ = this;
    }
}

target/scala-2.12/classes/example/Genericity.class
public final class Genericity
{
    public static void main(final String[] args) {
        Genericity$.MODULE$.main(args);
    }

    public static void test(final Person[] array) {
        Genericity$.MODULE$.test(array);
    }
}
*/
object Genericity{

  def test(array: Array[Person]) = {
    println(array.map(_.name).mkString(" "))
  }

  def main(args: Array[String]) {
    test(Array(new Person("Mike"), new Student("Nigel")))
    // test(Array[Student](new Student("Mike")))
  }
}
