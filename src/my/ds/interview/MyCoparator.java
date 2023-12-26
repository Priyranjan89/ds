package my.ds.interview;

import java.util.Comparator;


public class MyCoparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s2.getMarks() > s2.getMarks()){
            return 1;
        }  else if (s2.getMarks()<s1.getMarks()){
            return -1;
        } else {
            return 0;
        }

    }
}