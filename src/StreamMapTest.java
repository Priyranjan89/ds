import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "ABC", "IT", 15000);
        Employee employee2 = new Employee(2, "XYZ", "IT", 18000);
        Employee employee3 = new Employee(3, "RAMA", "Opration", 20000);
        Employee employee4 = new Employee(4, "RAJU", "HR",25000);
        Employee employee5 = new Employee(5, "YANG", "IT",32000);
        Employee employee6 = new Employee(6, "TOM", "HR",22000);
        Employee employee7 = new Employee(7, "Sri", "Opration",30000);

        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7);

       // Map<String, Integer> departmant = new HashMap<>();

        double value = employees.stream().max(Comparator.comparing(emp -> emp.getSalary())).get().getSalary();
        System.out.println(value);

        Map<String, Employee> deprt =  employees.stream().collect(Collectors.toMap(Employee::getDeprt, Function.identity()));
        deprt.entrySet().stream().forEach(System.out::println);

        //Map<String, Integer> deprt1 =  employees.stream().collect(Collectors.groupingBy(Employee::getDeprt, Function.identity()));

    }

}
