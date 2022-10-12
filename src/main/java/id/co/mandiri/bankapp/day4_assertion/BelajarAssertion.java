package id.co.mandiri.bankapp.day4_assertion;

public class BelajarAssertion {
    public static void main(String[] args) {
        System.out.println("entering main method");
        int i = -10;
        if(i>0){
            System.out.println("i possitive");
        }else{
            assert i <= 0 : "i bernilai negative";
        }
        System.out.println("leaving main method");
    }
}
