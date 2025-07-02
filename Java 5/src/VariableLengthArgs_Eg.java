import java.util.Arrays;

public class VariableLengthArgs_Eg {
    public static void main(String[] args) {
        checkNum(new int[]{1, 2, 3, 4});
        checkNumber(new int[]{1, 2, 3, 4});
    }

    // Before Java 5
    public static void checkNum(int[] arrays) {
        System.out.println(Arrays.toString(arrays));
    }

    // After Java 4
    public static void checkNumber(int... arrays) {
        System.out.println(Arrays.toString(arrays));
    }
}

// Purpose: Allows methods to accept zero or more arguments of a specified type,
// simplifying method signatures.