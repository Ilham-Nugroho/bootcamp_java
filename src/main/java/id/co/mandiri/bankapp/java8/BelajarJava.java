package id.co.mandiri.bankapp.java8;

interface Java8 {
    void test();
    default void testDefault(){
        System.out.println("default method in interface");
    }

    static void testStatic(){
        System.out.println("static method in interface");
    }
}

public class BelajarJava{
    public static void main(String[] args) {
        Java8.testStatic();

        new Java8(){
            @Override
            public void test() {
                System.out.println("test implementasi");
            }
        }.testDefault();
    }
}