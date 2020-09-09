package _Задачи;
import javax.net.ssl.SSLContext;
class A {
    {
        System.out.println("one");
    }
    public static void main (String[] args) {
        System.out.println("two");
    }
    static {
        System.out.println("three");
    }
}
