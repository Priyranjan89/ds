package my.ds.letcode.essay.Arrays;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        /*String result = "";
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<indices.length; j++){
                if(i == indices[j]){
                    result+= s.charAt(j);
                    break;
                }
            }
        }*/

        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<indices.length; i++){
            str.setCharAt(indices[i], s.charAt(i));
        }
        return str.toString();
    }

    public static void main( String []arg){
        int inputArr[] = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        ShuffleString shuffleString = new ShuffleString();
        String result = shuffleString.restoreString(s, inputArr);


        String s1 = new String("Ranjan");
        String s2  = new String("Ranjan");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Ranjan");
        StringBuffer sb2 = new StringBuffer("Ranjan");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
