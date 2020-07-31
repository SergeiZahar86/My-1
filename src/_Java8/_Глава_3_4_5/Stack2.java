package _Java8._Глава_3_4_5;
// This class defines an integer stack that can hold 10 values.
class Stack2 {
    int stck[] = new int[10];
    int tos;
    // Initialize top-of-stack
    Stack2 () {
        tos = -1;
    }
    // Push an item onto the stack
    void push (int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    // Pop an item from the stack
    int pop () {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}

