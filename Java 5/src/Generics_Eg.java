import java.util.ArrayList;

public class Generics_Eg {
    public static void main(String[] args) {
        // Before Java 5
        ArrayList list = new ArrayList();
        list.add("Hello");
        String s = (String) list.get(0);

        // With Java 5 Generics
        ArrayList<String> string = new ArrayList<String>(); // Java 5, we need type initialization
        string.add("Hello");
        String s1 = string.get(0); // We can get the elements by index, similar to Arrays
    }
}

// Purpose: Enable classes, interfaces, and methods to operate on typed parameters,
// providing compile-time type safety and eliminating the need for casting.