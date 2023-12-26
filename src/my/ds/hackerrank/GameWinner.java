package my.ds.hackerrank;

public class GameWinner {
   /* public enum Turn{
        WENDY('w'), BOB('b');

        private char ch;

        Turn(char ch) {
            this.ch = ch;
        }

        public char getChar(){
            return this.ch;
        }
    }

    public static String gameWinner(String colors){
        Turn turn = Turn.BOB;

        for(int i = 1; i < colors.length()-1; i++){

            char cur = colors.charAt(i);
            char prev = colors.charAt(i - 1);
            char next = colors.charAt(i + 1);

            if(cur == turn.getChar() && prev ==  turn.getChar() && next == turn.getChar()){

                //player plays
                StringBuilder col = new StringBuilder(colors);
                col.deleteCharAt(i);
                colors = col.toString();

                turn = (turn.equals(Turn.WENDY))? Turn.BOB : Turn.WENDY;
            }
        }
        return turn.toString();
    }*/

    public static int findAdjacentIndexwhichCanBeRemoved(String a, char gameChangerName){
        char array[] = a.toCharArray();
        int sameCount = 0;
        for (int i = 1; i < array.length-1; i++) {

            if((array[i] == 'w' || array[i] == 'b') && (array[i-1] == 'w' || array[i-1] == 'b') &&  (array[i+1] == 'w' || array[i+1] == 'b')) {
                // incase we have any other color
                return i;
            }
            if(array[i] == array[i+1] && array[i] == gameChangerName) {
                sameCount++;
            } else {
                sameCount = 0;
            }
            if(sameCount == 2) {
                return -2;
            }
        }
        return -1;
    }
    /*
     * Complete the 'gameWinner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING colors as parameter.
     */
    static boolean turn = false;
    public static String gameWinner(String colors) {
        // Write your code here

        turn = !turn;
        char name = turn ? 'w' : 'b';

        int indexToBeRemoved = findAdjacentIndexwhichCanBeRemoved(colors, name);
        if (indexToBeRemoved == -2) {
            return "";
        }
        if (indexToBeRemoved == -1) {
            return name != 'w' ? "wendy" : "Bob";
        } else {
            StringBuilder sb = new StringBuilder(colors);
            sb.deleteCharAt(indexToBeRemoved);
            colors = sb.toString();
            return gameWinner(colors);
        }
    }
    public static void main(String[] args) {
        System.out.println(gameWinner("wwwbbbbwww"));
       System.out.println(gameWinner("wwwbb"));
    }
}
