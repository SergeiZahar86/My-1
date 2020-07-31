package _Java8._Глава_18_Collections_Framework_60._5;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main (String[] args) {
        Queue <String> names = new LinkedList <String>();
        // offer(E): Вставляет дополнительно элемент в очередь (queue).
        // С очередью LinkedList элемент будет вставлен в конце очереди.
        // Возвращает true если вставлено успешно.
        // Возвращает false если в очереди больше нет места.
        names.offer("E");
        names.offer("A");
        names.offer("M");
        // add(E):  Вставляет дополнительно элемент в очередь.
        // С очередью LinkedList элемент будет вставлен в конце очереди.
        // Возвращает true если вставлено успешно.
        // Выбрасывает исключение если в очереди больше нет места.
        names.add("G");
        names.add("B");
        while (true) {
            // Получает и удаляет первый элемент из очереди.
            // Возвращает null если большне нет элементов в очереди.
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name=" + name);
        }
    }
}
