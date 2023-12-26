package my.ds.interview;

public class Employee extends Person{
    public Employee()
    {
        System.out.println("Employee class constructor called");
    }
    @Override
    public final void  m1(){
        System.out.println("Execute Employee class m1() method");
    }

}
