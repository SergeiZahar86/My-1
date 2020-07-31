package _Java8._Глава_15_10_издание._4;
// A block lambda that computes the factorial of an int value.
interface NumericFunc {
    int func (int n);
}
class BlockLambdaDemo {
    public static void main (String args[]) {
        // Это блочное лямбда-выражение вычисляет
        //// факториал целочисленного значения
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("The factoral of 3 is " +
                factorial.func(3));
        System.out.println("The factoral of 5 is " +
                factorial.func(5));
    }
}

