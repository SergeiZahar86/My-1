package _Java8._Глава_20_java_util._753;
// Demonstrate Currency.
import java.util.*;
class CurDemo {
    public static void main (String args[]) {
        Currency c;
        c = Currency.getInstance(Locale.US);
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " +
                c.getDefaultFractionDigits());
    }
}
