package my.ds.interview;

public class SecondNonRepeatingCharacter {

    public static void main(String[] args) {
        char result = findNonRepeatingCharacter("ELEPHANT");
        System.out.println(result);

        char result2 = findNonRepeatingCharacter("MALAYALAM");
        System.out.println(result2);
    }


    public static char findNonRepeatingCharacter(String str){
        char result = '\0';
        int countPosition = 0;

        for (char i : str.toCharArray()){
            if (str.indexOf(i) == str.lastIndexOf(i)){
                result = i;
                countPosition++;
            }
            if(countPosition == 2){
                break;
            }
        }
        return result;
    }
}
