package my.ds.tree;


/*
*               10
			6	   11
		3		8
	2		5		9*/

        import java.util.LinkedList;
        import java.util.Queue;

public class PrintRightOfTree {
    Node root;

    public static void printRight(Node root){

        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

       /* while (!queue.isEmpty()){
            int len = queue.size();

            for (int i = 1; i<=len;i++){

                if (i == len){
                    System.out.println(temp.data+" ");
                }

                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                     queue.add(temp.right);
                }
            }
        }*/
    }

    public static void main(String[] args) {
        PrintRightOfTree tree = new PrintRightOfTree();
        tree.root = new Node(10);
        tree.root.left = new Node(6);
        tree.root.right = new Node(11);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        printRight(tree.root);
    }
}
