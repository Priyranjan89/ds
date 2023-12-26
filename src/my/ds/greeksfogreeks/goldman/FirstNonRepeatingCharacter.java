package my.ds.greeksfogreeks.goldman;

public class FirstNonRepeatingCharacter {

    public  static char[] getCharArrayCount(String str){
        char count[] = new char[256];
        for (int i = 0; i<str.length();i++){
            count[str.charAt(i)]++;
        }

        return count;
    }

    public static char firstNonRepeating(String str){
        int index = -1;
        char count[] = getCharArrayCount(str);

        for (int i =0; i< str.length(); i++){
            if (count[str.charAt(i)] == 1){
                index = i;
                break;
            }
        }

        return str.charAt(index);
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("First non-repeating character is: "+firstNonRepeating(str));
    }
}
