package _Java8._Глава_18_Collections_Framework_60._8;
import java.util.Vector;
public class VectorDemo1 {
    public static void main (String[] args) {
        // Создать объект Vector.
        // С начальной емкостью (capacity) 10 элементов.
        // Автоматически увеличить емкость еще на 5 если
        // количество элементов больше, чем емкость на данный момент
        Vector <Integer> v = new Vector <>(10, 5);
        v.add(123);
        v.add(245);
        v.add(345);
        v.add(null);
        // Напечатать реальное количество элементов,
        // содержащиеся в Vecter (Не емкость)
        System.out.println("Size:" + v.size());// =4
        // Получить элемент в индексе 1.
        // Похоже на метод get(int).
        Integer i = v.elementAt(1);
        System.out.println("v.elementAt(1)=" + i);// 245
        // Заменить элемент в индексе 1.
        v.setElementAt(1, 1000);
        //
        System.out.println("New value:" + v.get(1));// =1000 .
    }
}
