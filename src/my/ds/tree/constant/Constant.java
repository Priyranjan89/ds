package my.ds.tree.constant;

import my.ds.tree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class Constant {

   public static void printTreeGraphically(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();

        int CurrentLevel = 1;
        boolean previousLevelWasAllNull = false;
        queue.add(root);
        level.add(1);

        System.out.println("\nPrinting Level order traversal of Tree...");
        if(root == null) {
            System.out.println("Tree does not exists !");
            return;
        }

        while (!queue.isEmpty()) {
            if(CurrentLevel == level.peek()) { //if we are in the same level
                if(queue.peek()==null) {
                    queue.add(null);level.add(CurrentLevel+1);
                }else {
                    queue.add(queue.peek().getLeft());
                    level.add(CurrentLevel+1);
                    queue.add(queue.peek().getRight());
                    level.add(CurrentLevel+1);
                    previousLevelWasAllNull = false;
                }
                System.out.print(queue.remove() + "  ");level.remove();
            }else { //level has changed
                System.out.println("\n");
                CurrentLevel++;
                if(previousLevelWasAllNull == true) {
                    break;
                }
                previousLevelWasAllNull = true;
            }
        }//end of loop
    }
}
