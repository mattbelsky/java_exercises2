package part_08;

public class StackFullException extends Exception {
    @Override
    public String toString() {
        return "StackFullException caught.\nStack is full.";
    }
}
