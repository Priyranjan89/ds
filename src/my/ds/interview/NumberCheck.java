package my.ds.interview;

public class NumberCheck {
    public static void main(String[] args) {
        Integer i =0;
        Integer j = 5;
        Number n = null;

        try {
            System.out.println(n.intValue()-j);
        } catch(NullPointerException ex){
            System.out.println("NullPointerException");
        } catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }
    }
}
