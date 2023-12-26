package my.ds.interview;

import java.util.HashMap;
import java.util.Map;

public class ImmutableEmployeeTest {
    public static void main(String[] args) {

        Map<String, String> address = new HashMap<>();
        address.put("1", "first");
        address.put("2", "second");

        ImmutableEmployee immutableEmployee = new ImmutableEmployee(1,"Ranjan", address);

        System.out.println(immutableEmployee.getId());
        System.out.println(immutableEmployee.getName());
        System.out.println(immutableEmployee.getAddress());

        address.put("3", "third");
        System.out.println(immutableEmployee.getAddress());
        immutableEmployee.getAddress().put("4", "Fourth");
        System.out.println(immutableEmployee.getAddress());

    }
}
