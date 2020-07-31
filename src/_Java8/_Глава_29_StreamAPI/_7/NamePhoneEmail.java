package _Java8._Глава_29_StreamAPI._7;
// Использовать метод collect() для создания
// списка типа List и множества типа Set из потока данных
import java.util.*;
import java.util.stream.*;
class NamePhoneEmail {
    String name;
    String phonenum;
    String email;
    NamePhoneEmail (String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}
class NamePhone {
    String name;
    String phonenum;
    NamePhone (String n, String p) {
        name = n;
        phonenum = p;
    }
}
class StreamDemo7 {
    public static void main (String[] args) {
        // Список имен, номеров телефонов и
        // адресов электронной почты
        ArrayList <NamePhoneEmail> myList = new ArrayList <>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
        // отобразить только имена и номера телефонов
        // на новый поток данных
        Stream <NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
        // вызвать метод collect(), чтобы составить
        // список типа List из имен и номеров телефонов
        List <NamePhone> npList = nameAndPhone.
                collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List:");
        for (NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);
        // вызвать метод collect(), чтобы составить
        // список типа List из имен и номеров телефонов
        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
        // а теперь создать множество типа Set,
        // вызвав метод collect()
        Set <NamePhone> npSet = nameAndPhone.
                collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        for (NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);

    }
}

