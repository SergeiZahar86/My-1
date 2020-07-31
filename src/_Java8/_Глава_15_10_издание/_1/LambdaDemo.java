package _Java8._Глава_15_10_издание._1;
// Demonstrate a simple lambda expression.
// A functional interface.
interface MyNumber {
    double getValue ();
}
class LambdaDemo {
    public static void main (String args[]) {
        MyNumber myNum;  // объявить ссылку на
        // функциональный интерфейс
        // Здесь лямбда-выражение просто является
        // константным выражением. Когда оно присваивается
        // ссылочной переменной myNum, получается экземпляр
        // класса, в котором лямбда-выражение реализует
        // метод getValue() из функционального
        // интерфейса MyNumber
        myNum = () -> 123.45;
        // вызвать метод getValue(), предоставляемый
        // присвоенным ранее лямбда-выражением
        System.out.println("A fixed value: " + myNum.getValue());
        //А здесь используется более сложное выражение
        myNum = () -> Math.random() * 100;
        // В следующих строках кода вызывается лямбда-выражение
        // из предыдущей строки кода
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
        // Лямбда-выражение должно быть совместимо
        //по типу данных с абстрактным методом,
        // определяемым в функциональном интерфейсе.
        // Поэтому следующая строка кода ошибочна:
        //  myNum = () -> "123.03"; // Error!
    }
}

