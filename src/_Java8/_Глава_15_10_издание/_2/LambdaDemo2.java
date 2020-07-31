package _Java8._Глава_15_10_издание._2;
// Demonstrate a lambda expression that takes a parameter.
// Another functional interface.
interface NumericTest {
    boolean test (int n);
}
class LambdaDemo2 {
    public static void main (String args[]) {
        // A lambda expression that tests if a number is even.
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("9 is not even");
        // Now, use a lambda expression that tests if a number
        // is non-negative.
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
    }
}

