package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09 {
    public static void main(String[] args) {
        Exercise_09 varargs = new Exercise_09();
        System.out.println(varargs.varargsMethod("Good ", "morning", ", ", "what ", "a ", "beautiful ", "day", "!"));
        System.out.println(varargs.varargsMethod("I'm ", "Raj", ", ", "your ", "personal ", "assistant."));
        System.out.println(varargs.varargsMethod("What ", "shall ", "we ", "code ", "today?"));

    }

    public static StringBuilder varargsMethod(String ... v) {
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < v.length; i++) {
            sentence.append(v[i]);
        }

        return sentence;
    }
}



