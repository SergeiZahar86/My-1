package _Java8._Глава_18_Collections_Framework_60._6;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueDemo {
    public static void main (String[] args) {
        // С очередью(queue) PriorityQueue элемент будет распределен по естественному порядку.
        Queue <String> names = new PriorityQueue <String>();
        // offer(E): Вставляет дополнительно элемент в очередь (queue).
        // Возвращает true если добавлен успешно.
        // Возвращает  false если нет больше места.
        names.offer("E");
        names.offer("A");
        names.offer("M");
        // add(E): Вставляет дополнительно элемент в очередь (queue).
        // Возвращает true если добавлен успешно.
        // Выбрасывает Exception если очередь заполнена.
        names.add("G");
        names.add("B");
        while (true) {
            // poll(): Получить и удалить первый элемент из очереди.
            // Возвращает null если больше нет элементов в очереди.
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name=" + name);
        }
    }
}
