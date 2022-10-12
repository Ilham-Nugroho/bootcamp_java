package id.co.mandiri.bankapp.java8;

import java.util.ArrayList;
import java.util.Arrays;

public class BelajarStream_1 {
    public static void main(String[] args) {
        int [] values = {1,2,3,4,5,6,7,8,9,7,4,3,5};
        int max = Arrays.stream(values).max().getAsInt();

        double avg = Arrays.stream(values).average().getAsDouble();
        int total = Arrays.stream(values).sum();
        System.out.println("max value = " + max);
        System.out.println("avg = " + avg);
        System.out.println("tptal = " + total);
    }
}
