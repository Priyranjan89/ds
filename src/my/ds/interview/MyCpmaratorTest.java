package my.ds.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCpmaratorTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("ABC", 70));
        students.add(new Student("XYZ", 80));
        students.add(new Student("MNP", 90));
        students.add(new Student("Raja", 75));

        students.forEach(System.out::println);

        Collections.sort(students,new MyCoparator());

        System.out.println("After sort");
        students.forEach(System.out::println);
    }
}
