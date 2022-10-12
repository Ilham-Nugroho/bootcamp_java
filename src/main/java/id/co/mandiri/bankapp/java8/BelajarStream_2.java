package id.co.mandiri.bankapp.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Siswa{
    String  nama;
    int usia;
    double nilai;

    public Siswa(String nama, int usia, double nilai) {
        this.nama = nama;
        this.usia = usia;
        this.nilai = nilai;
    }


    public String toString() {
        String format ="Nama: %s, Usia: %s, Nilai: %s";
        return String.format(format, nama, usia, nilai);
    }
}

public class BelajarStream_2 {
    public static void main(String[] args) {
        List<Siswa> siswaList = Arrays.asList(
                new Siswa("Tony", 15, 85.5),
                new Siswa("Hawk", 16, 86.5),
                new Siswa("Marco", 14, 86.5),
                new Siswa("Polo", 17, 84.5)
        );

        Siswa senior = siswaList.stream().max(Comparator.comparing(s->s.usia)).get();
        System.out.println("Siswa paling senior: " + senior);

        System.out.println("Urutan siswa berdasarkan nilai: ");
        siswaList.stream().sorted(Comparator.comparing(s->s.nilai)).forEach(System.out::println);

    }
}
