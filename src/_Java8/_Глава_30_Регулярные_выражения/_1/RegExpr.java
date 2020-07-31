package _Java8._Глава_30_Регулярные_выражения._1;
// A simple pattern matching demo.
import java.util.regex.*;
class RegExpr {
    public static void main (String args[]) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches(); // проверить на совпадение
        System.out.println("Testing Java against Java.");
        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");
        System.out.println();
        System.out.println("Testing Java against Java 9.");
        mat = pat.matcher("Java 9"); // создать новый
        // сопоставитель с шаблоном
        found = mat.matches(); // проверить на совпадение
        if (found) System.out.println("Matches");
        else System.out.println("No Match");
    }
}

