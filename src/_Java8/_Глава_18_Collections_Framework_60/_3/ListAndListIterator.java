package _Java8._Глава_18_Collections_Framework_60._3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListAndListIterator {
    public static void main (String[] args) {
        // Создать объект List (Содержащий только String).
        List <String> list = new ArrayList <String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        // Получить объект ListIterator для просмотра элементов списка.
        // (Theo đúng trình tự).
        // Возвращает список iterator элементов данного списка
        // (в определенном порядке)
        ListIterator <String> listIterator = list.listIterator();
        // В данный момент курсор стоит на первой позиции Iterator.
        // Стоит в позиции с индексом 0.
        // Получить первый элемент в Iterator, курсор движется вперед на один шаг.
        String first = listIterator.next();
        System.out.println("first:" + first);// -->"One"
        // В данный момент курсор стоит в позиции с индексом 1.
        // Получить следующий элемент.
        String second = listIterator.next();
        System.out.println("second:" + second);// -->"Two"
        // Проверить может ли курсор перепрыгнуть назад на 1 позицию или нет.
        if (listIterator.hasPrevious()) {
            // Перепрыгнуть назад на 1 шаг.
            String value = listIterator.previous();
            System.out.println("value:" + value);// -->"Two"
        }
        System.out.println(" ----- ");
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println("value:" + value);
        }
    }
}
