package my.ds.letcode.essay.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int greatestNumber = 0;

        for(int i = 0; i < candies.length; i++){
            if(candies[i] >= greatestNumber){
                greatestNumber = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++){
            int temp = candies[i] + extraCandies;
            if(temp >= greatestNumber){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main( String []arg){
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        KidsWithTheGreatestNumberOfCandies numberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        List<Boolean> result = numberOfCandies.kidsWithCandies(candies, extraCandies);
        System.out.println(result.toString());
    }
}
