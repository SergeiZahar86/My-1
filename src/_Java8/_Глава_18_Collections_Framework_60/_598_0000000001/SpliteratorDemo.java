package _Java8._Глава_18_Collections_Framework_60._598_0000000001;
import java.util.ArrayList;
import java.util.Spliterator;
public class SpliteratorDemo {
    public static void main (String[] args) {
        ArrayList <Double> vals = new ArrayList <>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        System.out.println("Coдepжимoe списочного массива vals :\n");
        Spliterator <Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance(System.out :: println));
        System.out.println();
        spltitr = vals.spliterator();
        ArrayList <Double> sqrs = new ArrayList <>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        System.out.println("Coдepжимoe списочного массива sqrs :\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining(System.out :: println);
        System.out.println();
    }
}
