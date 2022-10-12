package id.co.mandiri.bankapp.java8;


import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface MathOps{
    void operation(int a, int b);
}

interface DoubleMathOps {
    double operation(double a, double b);
}

public class BelajarJava8Ver2 {
    public static void main(String[] args) {
//        new MathOps(){
//            @Override
//            public void operation(int a, int b) {
//                System.out.println("a x b = " + (a * b));
//            }
//        }.operation(7, 9);

        MathOps mathOps = (a,b) -> {
            System.out.println("a + b = " + (a*b));
        };
        mathOps.operation(7,9);
    }
}
