package my.ds.interview;

public class LengthOfStringWithoutUsingAnyInbuiletFunction {

    public static void main(String[] args) {
        String str = "Priyaranjan Singh";
        System.out.println(str.lastIndexOf(""));
        int count =0;
        for (char c : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
