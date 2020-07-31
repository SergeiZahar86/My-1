package _Java8._Глава_29_StreamAPI._4;
// Map one stream to another.
import java.util.*;
import java.util.stream.*;
class StreamDemo4 {
    public static void main (String[] args) {
        // Список числовых значений типа double
        ArrayList <Double> myList = new ArrayList <>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        // Отобразить квадратные корни элементов из
        // списка myList на новый поток данных
        Stream <Double> sqrtRootStrm = myList.stream().
                map(Math :: sqrt);
        // получить произведение квадратных корней
        double productOfSqrRoots = sqrtRootStrm.
                reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of square roots is " +
                productOfSqrRoots);
    }
}

