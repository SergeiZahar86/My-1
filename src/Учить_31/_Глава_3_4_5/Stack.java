package Учить_31._Глава_3_4_5;
public class Stack {
    int[] stck = new int[10];
    int tos;
    //инициализировать вершину стека
    Stack () {
        tos = -1;
    }
    //поместить элемент в стек
    void push (int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }
    //извлечь элемент из стека
    int pop () {
        if (tos < 0) {
            System.out.println("стек пуст");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
class Stack33 {
    public static void main (String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        //поместить несколько чисел в стек
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        //вытолкнуть эти числа из стека
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop());
        }
        System.out.println();
        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop());
        }
        System.out.println();
        System.out.println("Моя реализация");
        System.out.println();
        StackClon33 stackClon33 = new StackClon33();
        stackClon33.main1();
    }
}
class StackClon {
    int[] stck = new int[10];
    int tos;
    StackClon () {
        tos = -1;
    }
    void push (int item) {
        if (tos == 9) {
            System.out.println("Стек полон");
        } else {
            stck[++tos] = item;
        }
    }
    int pop () {
        if (tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
class StackClon33 {
    void main1(){
        StackClon stackClon1 = new StackClon();
        StackClon stackClon2 = new StackClon();
        for (int i = 0; i<10;i++){
            stackClon1.push(i);
        }
        for (int i = 0; i<10; i++){
            stackClon2.push(i);
        }
        System.out.println("Содержимое stackClon1");
        for (int i = 0; i<10;i++){
            System.out.print(stackClon1.pop());

        }
        System.out.println("Содержимое stackClon2");
        for (int i =0; i<10; i++){
            System.out.print(stackClon2.pop());
        }
    }
}

