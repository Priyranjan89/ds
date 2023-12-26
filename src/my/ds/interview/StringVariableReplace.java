package my.ds.interview;

public class StringVariableReplace {
    public static void main(String[] args) {
        String str = "I_Am_Priyaranjan";

        str=str.replaceAll("_","");
        System.out.println(str);
    }
}
