package my.ds.letcode.essay.Arrays;

public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int output = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                output++;
            } else {
                output--;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        FinalValueOfVariableAfterPerformingOperations afterPerformingOperations =
                new FinalValueOfVariableAfterPerformingOperations();

        String operations[] = new String[]{"--X","X++","X++"};
        int result = afterPerformingOperations.finalValueAfterOperations(operations);
        System.out.println(result);
    }
}
