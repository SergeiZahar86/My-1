package _Java8._Глава_18_Collections_Framework_60._12;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class SortedMapDemo {
    public static void main (String[] args) {
        Map <String, String> map = new TreeMap <>();
        map.put("01000005", "Tom");
        map.put("01000002", "Jerry");
        map.put("01000003", "Tom");
        map.put("01000004", "Donald");
        // Этот набор расспределен по возрастанию.
        Set <String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Phone: " + key);
        }
        System.out.println("-----");
        // Этот набор так же расспределен по key.
        Set <Map.Entry <String, String>> entries = map.entrySet();
        for (Map.Entry <String, String> entry : entries) {
            System.out.println("Phone: " + entry.getKey());
        }
    }
}
