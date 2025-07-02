import java.util.ArrayList;

public class AutoBoxing_Unboxing_Eg {
    public static void main(String[] args) {
        // Before Java 5
        ArrayList list = new ArrayList();
        list.add(new Integer(42));
        int x = ((Integer) list.get(0)).intValue();

        // With Java 5
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(42); // int automatically boxed to Integer
        int y = list1.get(0); // Integer automatically unboxed to int
    }
}

// Purpose:
// Automatically converts between primitive types (int, double, etc.) and
// their corresponding wrapper classes (Integer, Double, etc.).