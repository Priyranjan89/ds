public class Employee {
    private int Id;
    private String name;
    private String deprt;
    private double salary;

    public Employee(int id, String name, String deprt, double salary) {
        Id = id;
        this.name = name;
        this.deprt = deprt;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDeprt() {
        return deprt;
    }

    public double getSalary() {
        return salary;
    }
}
