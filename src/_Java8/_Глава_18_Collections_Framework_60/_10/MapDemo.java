package _Java8._Глава_18_Collections_Framework_60._10;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {
    public static void main (String[] args) {
        Map <String, String> map = new HashMap <>();
        map.put("01000005", "Tom");
        map.put("01000002", "Jerry");
        map.put("01000003", "Tom");
        map.put("01000004", "Donald");
        // Получить набор содержащий ключи (key).
        // Этот набор не будет расспределен.
        Set <String> phones = map.keySet();
        for (String phone : phones) {
            System.out.println("Phone: " + phone + " : " + map.get(phone));
        }
    }
}
