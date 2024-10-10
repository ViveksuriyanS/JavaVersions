package DefaultMethodsInInterface;

public interface Parent {
    /*
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
    void method6();
     */


    default void method1() {
        System.out.println("Default method");
    }
    default void method2() {
        System.out.println("Default method");
    }
    default void method3() {
        System.out.println("Default method");
    }
    default void method4() {
        System.out.println("Default method");
    }
    default void method5() {
        System.out.println("Default method");
    }
    default void method6() {
        System.out.println("Default method");
    }
}
