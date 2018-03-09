package part_08;

public class StackEmptyException extends Throwable {
    @Override
    public String toString() {
        return "StackEmptyException caught.\nStack is empty.";
    }
}
