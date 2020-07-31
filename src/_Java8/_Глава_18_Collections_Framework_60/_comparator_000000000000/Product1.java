package _Java8._Глава_18_Collections_Framework_60._comparator_000000000000;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Car implements Comparable <Car> {
    private String name;
    private int speed;
    private int quantity;
    Car(String name, int speed, int quantity){
        this.name = name;
        this.speed = speed;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    @Override public String toString () {
        return "Название " + name + " Скорость " + speed + " Пробег " + quantity;
    }
    @Override public int compareTo (Car o) {
        return this.speed - o.speed;
    }
}
class SortedByName implements Comparator<Car> {
    @Override public int compare (Car o1, Car o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }
}
class SortedByQuantity1 implements Comparator<Car> {
    @Override public int compare (Car o1, Car o2) {
        int quantity1 = o1.getQuantity();
        int quantity2 = o2.getQuantity();
        if (quantity1 > quantity2){
            return 1;
        } else if (quantity1 < quantity2){
            return -1;
        }else return 0;
    }
}
class Example1 {
    public static void main (String[] args) {
        List<Car> cars = new ArrayList <>();
        cars.add(new Car("Toyota", 180, 550));
        cars.add(new Car("Porshe", 250, 200));
        cars.add(new Car("BMW", 220, 300));
        System.out.println("Без сортировки");
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("Сортировка по-умолчанию");
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("Сортировка по имени");
        Collections.sort(cars, new SortedByName());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("Сортировка по пробегу");
        Collections.sort(cars, new SortedByQuantity1());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
