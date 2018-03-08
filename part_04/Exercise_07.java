package part_04;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that accesses the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */
class StackController {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeStack = in.nextInt();
        Stack myStack = new Stack(sizeStack);

        // Fills the stack's array.
        for (int i = 0; i < sizeStack; i++) {
            myStack.push((char)i);
        }

        // Displays every other number of the array.
        for (int i = 0; i < sizeStack; i++) {
            int element = myStack.pop();
            System.out.print(element + " ");
        }
    }
}

class Stack {
    private char[] charArray;
    private int putLoc, getLoc;
    private int size;

    public Stack(int size) {
        charArray = new char[size];
        putLoc = 0;
        getLoc = size - 1;
        this.size = size;
    }

    public void push(char x) {
        if (putLoc == charArray.length) {
            System.out.println("Stack is full.");
            return;
        }
        charArray[putLoc++] = x;

    }

    public int pop() {
        if (getLoc == putLoc) {
            System.out.println("Stack is empty.");
            return 0;
        }
        return charArray[getLoc--];
    }
}