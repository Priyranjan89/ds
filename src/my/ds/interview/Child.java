package my.ds.interview;

public class Child extends Parent {
    int i = 1;
    public String submit(){
        return "Child";
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.submit());
        System.out.println(parent.i);
    }
}
