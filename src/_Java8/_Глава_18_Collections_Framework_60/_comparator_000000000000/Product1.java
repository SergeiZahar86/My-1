package _Java8._Глава_18_Collections_Framework_60._comparator_000000000000;
import java.util.*;
class Car1 implements Comparable <Car1> {
    private String name;
    private int speed;
    private int quantity;
    Car1 (String name, int speed, int quantity) {
        this.name = name;
        this.speed = speed;
        this.quantity = quantity;
    }
    public String getName () {
        return name;
    }
    public int getSpeed () {
        return speed;
    }
    public int getQuantity () {
        return quantity;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    @Override public String toString () {
        return "Имя " + name + "Скорость " + speed + "Пробег " + quantity;
    }
    @Override public int compareTo (Car1 o) {
        return this.getSpeed() - o.getSpeed();
    }
}
class SortedByQuantity implements Comparator<Car1>{
    @Override public int compare (Car1 o1, Car1 o2) {
        Integer quantity1 = o1.getQuantity();
        Integer quantity2 = o2.getQuantity();
        return quantity1.compareTo(quantity2);
    }
}
class SortedByName implements Comparator<Car1>{
    @Override public int compare (Car1 o1, Car1 o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
    }
}
class Example1{
    public static void main (String[] args) {
        ArrayList<Car1> car1s = new ArrayList <>();
        car1s.add(new Car1("BMW", 250, 100000));
        car1s.add(new Car1("Mersedes",240, 120000));
        car1s.add(new Car1("AUDI", 260, 140000));
        System.out.println("Машины без сортировки");
        for (Car1 car1: car1s){
            System.out.println(car1);
        }
        System.out.println("Сортировка по-умолчанию");
        Collections.sort(car1s);
        for (Car1 car1:car1s){
            System.out.println(car1);
        }
        System.out.println("Сортировка по имени");
        car1s.sort(new SortedByName());
        for (Car1 car1:car1s){
            System.out.println(car1);
        }
        System.out.println("Сортировка по пробегу");
        car1s.sort(new SortedByQuantity());
        for (Car1 car1: car1s){
            System.out.println(car1);
        }
    }
}
