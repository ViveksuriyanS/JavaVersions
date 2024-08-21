public class StringTemplates_Preview {
    public static void main(String[] args) {
        String name = "Vivek";
        int age = 31;
        String msg = "Hello World! I am " + name + " and I am " + age + " years old.";
        System.out.println(msg);

        String msg1 = STR."Hello World! I am \{name} and I am \{age} years old.";
        System.out.println(msg1);

        String longString = STR."""
                This is a long string
                and this could be very very long
                What I can tell is that
                I am \{name} and my age is \{age}
                """;
    }
}

// StringTemplating in Java 22 is a preview feature, which is available for test
// To enable this feature Settings -> Project -> Language Level -> Select Java 22 Preview
// This feature could be removed in the upcoming versions