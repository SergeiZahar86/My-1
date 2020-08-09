package _Java8._Глава_28_параллелизм._9;
// An example that uses a Callable.
import java.util.concurrent.*;
class CallableDemo {
    public static void main (String[] args) {
        ExecutorService executorService = Executors.
                newFixedThreadPool(3);
        Future <Integer> f1;
        Future <Double> f2;
        Future <Integer> f3;
        System.out.println("Starting");
        // submit - Отправляет на выполнение задачу,
       // возвращающую значение, и
       // возвращает Future
        f1 = executorService.submit(new Sum(10));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException | ExecutionException exc) {
            System.out.println(exc);
        }
        executorService.shutdown();
        System.out.println("Done");
    }
}
// Following are three computational threads.
// Три потока исполнения вычислений
class Sum implements Callable <Integer> {
    int stop;
    Sum (int v) {
        stop = v; }
    public Integer call () {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}
class Hypot implements Callable <Double> {
    double side1, side2;
    Hypot (double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }
    public Double call () {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}
class Factorial implements Callable <Integer> {
    int stop;
    Factorial (int v) {
        stop = v; }
    public Integer call () {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}

