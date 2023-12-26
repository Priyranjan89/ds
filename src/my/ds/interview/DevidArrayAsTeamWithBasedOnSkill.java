package my.ds.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DevidArrayAsTeamWithBasedOnSkill {

    public static void main(String args[]) {
        List<Integer> skill = Arrays.asList(3,4,3,1,6,5);
        int teamSize = 3;
        int maxDiff =2;

        Collections.sort(skill);
        int count =0;
        List<Integer> team1 = new ArrayList<>();
        List<Integer> team2 = new ArrayList<>();
        for (int i =0, j= teamSize-1, k =teamSize ; i<skill.size(); i++,j--,k++){
            if(j>=0){
                team1.add(skill.get(j));
            }
            if(k<skill.size()){
                team2.add(skill.get(k));
            }
        }
        for(int i =0, j=team1.size()-1; i<team1.size()-1;i++,j--){
            int min = team1.get(i)-team1.get(i+1);

            if(maxDiff>=min){
                count++;
            }

            int max = team2.get(j)- team2.get(j-1);
            if(maxDiff==max){
                count++;
            }
        }

        System.out.println(count);

    }
}


