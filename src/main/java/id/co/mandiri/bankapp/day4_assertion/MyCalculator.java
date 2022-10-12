package id.co.mandiri.bankapp.day4_assertion;

public class MyCalculator {
    public int multiply(int x, int y){
        if (x>999){
            throw new IllegalArgumentException("x should be less than 1000");
        }
        return x * y;
    }
}

