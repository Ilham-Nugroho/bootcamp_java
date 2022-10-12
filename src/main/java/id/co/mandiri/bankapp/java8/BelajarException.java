package id.co.mandiri.bankapp.java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class DummyClass{
    void  methodA(){
        try {
            FileInputStream file1 = new FileInputStream("test.txt");
            file1.read();
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    void methodB() throws FileNotFoundException {
        FileInputStream file1 = new FileInputStream("test.txt");
    }

    void methodC(){
        try {
            methodB();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

public class BelajarException {
    public static void main(String[] args) throws FileNotFoundException{
        new DummyClass().methodB();
    }
}
