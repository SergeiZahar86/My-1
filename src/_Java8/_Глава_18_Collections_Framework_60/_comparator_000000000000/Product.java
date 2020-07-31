package _Java8._Глава_18_Collections_Framework_60._comparator_000000000000;
import java.util.*;
public class Product implements Comparable <Product> {
    private String name;
    private int price;
    private int quantity;
    public Product (String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getPrice () {
        return price;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public int getQuantity () {
        return quantity;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString () {
        return "Наименование '" + name + "', цена - "
                + price + ", количество - " + quantity;
    }
    @Override public int compareTo (Product o) {
        return this.getPrice() - o.getPrice();
    }
}
// сортировка по названию
class SortedByName implements Comparator <Product> {
    public int compare (Product obj1, Product obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();
        return str1.compareTo(str2);
    }
}
// сортировка по цене
class SortedByPrice implements Comparator <Product> {
    public int compare (Product obj1, Product obj2) {
        int price1 = obj1.getPrice();
        int price2 = obj2.getPrice();
        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}
class Example {
    public static void main (String[] args) {
        // заполним объект Product содержимым
        List <Product> products = new ArrayList <>();
        products.add(new Product("Молоко", 35, 900));
        products.add(new Product("Кофе", 199, 90));
        products.add(new Product("Чай", 78, 150));
        // выведем данные без сортировки
        System.out.println("~~~~~ без сортировки");
        for (Product product : products) {
            System.out.println(product);
        }
        // Сортировка по умолчанию
        System.out.println("~~~~Сортировка по умолчанию");
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
        // Сортировка по цене
        Collections.sort(products, new SortedByPrice());
        System.out.println("\n~~~ сортировка по цене");
        for (Product product : products) {
            System.out.println(product);
        }
        // Сортировка по названию
        Collections.sort(products, new SortedByName());
        System.out.println("\n~~~ сортировка по названию");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
