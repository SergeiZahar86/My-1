package _Java8._Глава_15_10_издание._7;
// Use lambda expressions as an argument to a method.
interface StringFunc {
    String func (String n);
}
class LambdasAsArgumentsDemo {
    // Первый параметр этого метода имеет тип
    //// функционального интерфейса. Следовательно, ему
    //// можно передать ссылку на любой экземпляр этого
    //// интерфейса, включая экземпляр, создаваемый в
    //// лямбда-выражении. А второй параметр обозначает
    //// обрабатываемую символьную строку
    static String stringOp (StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main (String args[]) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Here is input string: " + inStr);
        // Ниже приведено простое лямбда-выражение,
        //// преобразующее в прописные все буквы в исходной
        //// строке, передаваемой методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);
        // А здесь передается блочное лямбда-выражение,
        // удаляющее пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("The string with spaces removed: " + outStr);
        // Можно, конечно, передать и экземпляр
        //// функционального интерфейса StringFunc,
        //// созданный в предыдущем лямбда-выражении.
        //// Например, после следующего объявления ссылка
        //// reverse делается на экземпляр
        //// интерфейса StringFunc
        StringFunc reverse = (str) -> {
            StringBuffer a = new StringBuffer();
            return a.append(str.toCharArray()).reverse().toString();
        };
        /*
            StringFunc reverse = (str) ->  {
          String result = "";
          int i;
          for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);

          return result;
        };
         */
        // А теперь ссылку reverse можно передать в
        //// качестве первого параметра методу stringOp(),
        //// поскольку она делается на объект типа StringFunc
        System.out.println("The string reversed: " +
                stringOp(reverse, inStr));
    }
}

