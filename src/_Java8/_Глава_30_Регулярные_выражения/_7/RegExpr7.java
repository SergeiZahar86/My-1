package _Java8._Глава_30_Регулярные_выражения._7;
// Use a character class.
import java.util.regex.*;
class RegExpr7 {
    public static void main (String args[]) {
        // Match lowercase words.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");
        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}

