package _Java8._Глава_15_10_издание._9;
// An example of capturing a local variable from the enclosing scope.
interface MyFunc {
    int func (int n);
}
class VarCapture {
    public static void main (String args[]) {
        // A local variable that can be captured.
        int num = 10;
        MyFunc myLambda = (n) -> {
            // Такое применение переменной num допустимо,
            //// поскольку она не видоизменяется
            int v = num + n;
            // Но следующая строка кода недопустима, поскольку
            //// в ней предпринимается попытка видоизменить
            //// значение переменной
            // num++
            return v;
        };
        // И следующая строка кода приведет к ошибке, поскольку
        //// в ней нарушается действительно конечное состояние
        //// переменной num
        //  num = 9;
    }
}

