package _Java8._Глава_15_10_издание._5;
// A block lambda that reverses the characters in a string.
interface StringFunc {
    String func (String n);
}
class BlockLambdaDemo2 {
    public static void main (String args[]) {
        // Это блочное выражение изменяет на обратный
        //// порядок следования символов в строке
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed is " +
                reverse.func("Lambda"));
        System.out.println("Expression reversed is " +
                reverse.func("Expression"));
    }
}

