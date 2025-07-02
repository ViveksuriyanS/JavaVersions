public class EnhancedForLoop_Eg {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Before Java 5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // With Java 5
        for (int s : arr) {
            System.out.println(s);
        }
    }
}

// Purpose: Simplifies iteration over arrays and collections, reducing boilerplate and errors.