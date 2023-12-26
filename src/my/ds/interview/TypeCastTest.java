package my.ds.interview;

public class TypeCastTest {
    public static void main(String[] args) {
        Add<Number> numberAdd = new Add<>();
        numberAdd.sum(9);

        Add<Double> doubleAdd = new Add<>();
        doubleAdd.sum(9.7);
    }
}
