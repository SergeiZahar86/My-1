package _Java8._Глава_15_0000000000._453_СылкиНаСтатическиеМетоды;
interface Func {
    String func(String n);
}
class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
class MethodRefDemo {
    static String KKU(Func sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        outStr = KKU(MyStringOps::strReverse, inStr);
        /*
        В этой строке кода ссылка на статический метод strReverse (),
        объявляемый в классе
        MyStringOps, передается первому аргументу метода KKU () .
        И это вполне допустимо, поскольку метод strReverse () совместим
        с функциональным интерфейсом Func. Следовательно. в выражении
         MyStringOps :: strReverse
        вычисляется ссылка на объект того класса, в котором метод
        strReverse () предоставляет реализацию метода func () из
        функционального интерфейса Func.
         */
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращённая строка: " + outStr);
    }
}
