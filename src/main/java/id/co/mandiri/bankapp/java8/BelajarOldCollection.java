package id.co.mandiri.bankapp.java8;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class BelajarOldCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("satu");
        list.add(new Integer(2));
        list.add(new Double(3.0));
        list.add("Empat");

        List<String> stringList = new ArrayList<>();
        stringList.add("Satu");
//      cuma bisa memasukkan sesuai tipe yg ada dalam <>
        List<String > stringList2 = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
    }
}
