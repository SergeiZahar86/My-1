package _Java8._Глава_15_10_издание._3;
// Demonstrate a lambda expression that takes two parameters.
interface NumericTest2 {
    boolean test (int n, int d);
}
class LambdaDemo3 {
    public static void main (String args[]) {
        // В этом лямбда-выражении проверяется,
        //// является ли одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
