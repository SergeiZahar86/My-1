package _Java8._Глава_8._Equals_HashCode;
import java.util.Objects;
public class Test {
    // Всё это сделал генератор кода в Intellig IDEA
    Test () {
    }
    private int a1 = 2;
    private int a2 = 5;
    public int getA1 () {
        return a1;
    }
    public int getA2 () {
        return a2;

    }
    public void setA1 (int a1) {
        this.a1 = a1;
    }
    public void setA2 (int a2) {
        this.a2 = a2;
    }
    @Override public String toString () {
        return "Test {" + "a1=" + a1 + ", a2=" + a2 + '}';
    }
    @Override public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return getA1() == test.getA1() &&
                getA2() == test.getA2();
    }
    @Override public int hashCode () {
        return Objects.hash(getA1(), getA2());
    }
    public static void main (String[] args) {
        Test test = new Test();
        System.out.println(test.hashCode());
    }
}
