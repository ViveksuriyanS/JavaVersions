public class RunMultipleJavaProgram {
    public static void main(String[] args) {

    }
}

// Earlier versions of java
// Compile -> javac Test.java -> Creates class file
// Execute -> java Test

// From java 11
// java Test.java -> Compiles [Creates Class File -> Test.class] and Executes Test.class

// From Java 22
// Compiling one main class, it compiles all the reference classes, that are mentioned in the main class
// For eg., In main class named Test.java, we have reference of Cat(), Rat(), Bat()
// java Test.java -> Compiles [Creates Class Files -> Test.class, Cat.class, Rat.class, Bat.class] and Executes Test.class