package _Java8._Глава_18_Collections_Framework_60._1;
import java.util.LinkedList;
public class HelloLinkedList {
    public static void main (String[] args) {
        // Создать объект LinkedList.
        LinkedList <String> list = new LinkedList <>();
        // Добавить некоторые элементы в список.
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        // Добавить элемент в конец списка.
        list.addLast("Z");
        // Добавить элемент в начало списка.
        list.addFirst("A");
        // Вставить элемент в позиции только с индексом 1.
        list.add(1, "A2");
        // Записать все элементы списка:
        System.out.println("Original contents of list: " + list);
        // Удалить элемент из списка
        list.remove("F");
        // Удалить элемент  в позиции только с индексом  2.
        list.remove(2);
        // Распечатаь список после удаления 2 элементов.
        System.out.println("Contents of list after deletion: " + list);
        // Удалить первый и последний элемент в списке.
        list.removeFirst();
        list.removeLast();
        // Распечать список после удаления.
        System.out.println("List after deleting first and last: " + list);
        // Получить элемент у индекса 2.
        String val = list.get(2);
        // Перенастроить элемент у индекса 2.
        list.set(2, val + " Changed");
        System.out.println("List after change: " + list);
    }
}
