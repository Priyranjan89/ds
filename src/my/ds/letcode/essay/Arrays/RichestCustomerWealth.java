package my.ds.letcode.essay.Arrays;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int sum =0;
        for (int row = 0; row < accounts.length; row++){
           int temp=0;
            for (int col = 0; col < accounts[row].length; col++){
               temp= temp + accounts[row][col];
            }
            if(temp> sum){
                sum = temp;
            }
        }
        return sum;
    }

    public static void main( String []arg){
        int inputArr[][] = {{1,3,8,8},{5,3,8,2},{9,4,3,5}};
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int result = richestCustomerWealth.maximumWealth(inputArr);
        System.out.println("Richest Customer :"+result);
    }
}
