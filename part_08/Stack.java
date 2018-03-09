package part_08;

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
        try {
            if (putLoc == charArray.length) {
                throw new StackFullException();
            }
            charArray[putLoc++] = x;
        }
        catch (StackFullException sfe) {
            sfe.toString();
        }
    }

    public int pop() {
        try {
            if (getLoc == putLoc) {
                throw new StackEmptyException();
            }
            return charArray[getLoc--];
        }
        catch (StackEmptyException see) {
            see.toString();
            return 0;
        }
    }
}