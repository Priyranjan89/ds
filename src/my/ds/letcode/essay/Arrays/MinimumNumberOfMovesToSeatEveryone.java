package my.ds.letcode.essay.Arrays;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i =0; i<seats.length;i++){
            result = result+Math.abs(students[i] - seats[i]);
        }

        return result;

    }

    public static void main(String[] args) {

        int seats[] = {4,1,5,9};
        int students[] = {1,3,2,6};

        int result = minMovesToSeat(seats, students);
        System.out.println(result);
    }
}
