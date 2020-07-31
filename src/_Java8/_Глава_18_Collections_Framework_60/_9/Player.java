package _Java8._Глава_18_Collections_Framework_60._9;
import java.util.SortedSet;
import java.util.TreeSet;
public class Player implements Comparable <Player> {
    private String name;
    private final int goldMedal;
    private final int silverMedal;
    private final int bronzeMedal;
    public Player (String name, int goldMedal, int silverMedal, int bronzeMedal) {
        this.name = name;
        this.goldMedal = goldMedal;
        this.silverMedal = silverMedal;
        this.bronzeMedal = bronzeMedal;
    }
    // Сравнить данный Player с другим Player.
    // Возвращает значение < 0, то есть данный Player  < Player other.
    // Если возвращает значение > 0, значит данный Player > Player other
    // Если возвращает значение = 0, значит данный Player = Player other.
    @Override
    public int compareTo (Player other) {
        // Сравнить количество золотых медалей.
        int value = this.goldMedal - other.goldMedal;
        if (value != 0) {
            return value;
        }
        // Сравнить количество серебряных медалей
        value = this.silverMedal - other.silverMedal;
        if (value != 0) {
            return value;
        }
        // Сравнить количество бронзовых медалей
        value = this.bronzeMedal - other.bronzeMedal;
        return value;
    }
    @Override
    public String toString () {
        return "[" + this.name + ", Gold: " + this.goldMedal //
                + ", Silver: " + this.silverMedal + ", Bronze: " //
                + this.bronzeMedal + "]";
    }
}
class SortedSetDemo {
    public static void main (String[] args) {
        // Создать объект SortedSet через подкласс TreeSet
        SortedSet <Player> players = new TreeSet <>();
        Player tom = new Player("Tom", 1, 3, 5);
        Player jerry = new Player("Jerry", 3, 1, 3);
        Player donald = new Player("Donald", 2, 10, 0);
        // Добавить элементы в коллекцию.
        // Они будут автоматически расставлены (По возрастанию).
        players.add(tom);
        players.add(jerry);
        players.add(donald);
        // Напечатать элементы.
        for (Player player : players) {
            System.out.println("Player: " + player);
        }
    }
}
