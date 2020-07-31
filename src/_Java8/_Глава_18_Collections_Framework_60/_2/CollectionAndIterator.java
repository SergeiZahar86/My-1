package _Java8._Глава_18_Collections_Framework_60._2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
public class CollectionAndIterator {
    public static void main (String[] args) {
        // Создать пустой объект Collection.
        // Создать коллекцию содержащую только String.
        Collection <String> coll = new Vector <String>();
        coll.add("Collection");
        coll.add("Queue");
        coll.add("List");
        coll.add("Map");
        // Распечатать количество элементов данной коллекции (collection).
        System.out.println("Size:" + coll.size());
        // Получить объект Iterator для получения доступа в элементы коллекции.
        // Этот объект Iterator содержит только String.
        Iterator <String> ite = coll.iterator();
        // Проверить имеет ли Iteractor следующие элементы или нет?
        while (ite.hasNext()) {
            // Получить элементы в позиции курсора
            // Потом переместить курсор на 1 шаг.
            String s = ite.next();
            System.out.println("Element:" + s);
        }
    }
}
