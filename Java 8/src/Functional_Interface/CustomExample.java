package Functional_Interface;

public class CustomExample{
    public static void main(String[] args) {
        int a = 5;

        // Usual way of using Interface by overriding the method
        Square sq = new Square() {
            @Override
            public int findArea(int x) {
                return x*x;
            }
        };
        System.out.println(sq.findArea(5));

        // Lambda Expression 1
        Square sq1 = x -> x*x;
        System.out.println(sq.findArea(6));

        // Lambda Expression 2
        Square sq2 = (x) -> x*x;
        System.out.println(sq.findArea(7));
    }
}

// Functional Interface
@FunctionalInterface
interface Square {
    int findArea(int x); // Abstract method i.e. abstract int findArea()

    // Multiple non-overriding abstract methods found in interface Functional_Interface.Square
    // int findNumberOfSides(int x); // Cannot have more than one abstract method in Functional Interface

    // In Functional Interface we have N number default methods
    default void default1(int y) {
        System.out.println(STR."Default method in functional interface\{y}"); // Not an abstract method, since it has a implementation
    }

    static void sayHi(String s) {
        System.out.println(STR."Static method in Funcional Interface. Hi \{s}"); // Not an abstract method
    }

}

// Interface methods are abstract and public by default
// Default and static methods are not abstract methods in Interface

// Default method vs Static method in Interface
//  Default Method -> default modifier in method signature
//  Static Method  -> static modifier in method signature
//
// 1. Default method can be overridden/invoked only in the classes that implements Interface
//    Static method can be invoked by any class, as it belongs only to that interface.

// 2. Default method cannot be called directly in sub-class
//    Static method can be directly accessed in the class

// 3. The default method behavior can be overridden with same method name
//    In class, we can have another static method with same name. Eg., SayHi()

// 4. Default method can never be static or private
//    Static method can be private

// 5. Default method is used to expose common behaviour for the class that implements interface
//    Static method can be used as a utility method
