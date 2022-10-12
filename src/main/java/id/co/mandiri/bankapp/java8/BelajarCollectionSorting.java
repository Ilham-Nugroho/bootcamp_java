package id.co.mandiri.bankapp.java8;

import java.time.LocalDate;
import java.util.*;

class Student {
    String name;
    LocalDate dob;
    Double grade;

    public Student(String name, LocalDate dob, Double grade){
        this.name = name;
        this.dob = dob;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "[" + name + ", " + dob + ", " + grade + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(dob, student.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob);
    }
}

public class BelajarCollectionSorting {
    public static void main(String[] args) {
        Student st1 = new Student("Andi", LocalDate.of(2000, 8, 10), 0.9);

        Student st2 = new Student("Tony", LocalDate.of(2001, 8, 11), 1.9);
        Student st3 = new Student("Hawk", LocalDate.of(2002, 8, 12), 2.9);
        Student st4 = new Student("Andi", LocalDate.of(2000, 8, 10), 3.9);


//        Set<Student> studentSet = new HashSet<>();
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        System.out.println(studentSet);

        System.out.println("===================");
        Comparator<Student> gradeComp = (s1,s2) -> s1.grade.compareTo(s2.grade);
        List<Student> studentList = new ArrayList<>(studentSet);
        studentList.sort(gradeComp);
        System.out.println(studentList);

    }
}
