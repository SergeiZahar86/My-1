package _Java8._Глава_18_Collections_Framework_60._7;
import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main (String[] args) {
        // Объявить объект ArrayList содержаций элемент вида Integer.
        ArrayList <Integer> list = new ArrayList <>(10);
        // Добавить элементы.
        list.add(123);
        list.add(245);
        list.add(345);
        // ArrayList позволяет добавить элементы null .
        // (Особенность List)
        list.add(null);
        // Распечатаь элементы ArrayList.
        System.out.println("Size:" + list.size());// =4
        // Получить случайный доступ в элемент индекса 1.
        Integer i = list.get(1);
        System.out.println("Element index 1 =" + i);// =245
        Integer newInt = 1000;
        // Заменить элемент в позиции с индексом 1.
        // Этот метод возвращает старый элемент.
        Integer old = list.set(1, newInt);
        //
        System.out.println("Old value:" + old);// =245 .
        System.out.println("New value:" + list.get(1));// =1000 .
    }
}
