import java.util.Arrays;

public class UnnamedVariable {
    public static void main(String[] args) {
        String _ = new String();
        // _ = ""; // Just we can create a object, but cannot be used as a reference

        // Example 1
        try {
            int i = Integer.parseInt("123");
        } catch (NumberFormatException _) {
            System.out.println("Invalid number");
        }

        // Example 2, Lambda function variable
        String[] s = {"Hi", "Hello", "World"};
        Arrays.stream(s).forEach(_ -> System.out.println("String"));
    }
}

// From earlier versions of java, '_' is not a valid identifier name
// In java 22, '_' is used when we create a object, but functionally is not useful
