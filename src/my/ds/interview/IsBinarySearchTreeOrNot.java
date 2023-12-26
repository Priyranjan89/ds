package my.ds.interview;

public class IsBinarySearchTreeOrNot {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isBST(Node node){

        return isBST(node, null, null);
    }

    public static boolean isBST(Node root, Integer max, Integer min){

        if (root == null)
            return true;

        if (max != null && root.data >= max){
            return false;
        }
        if (min != null && root.data <= min){
            return false;
        }
        return isBST(root.left, root.data, min) && isBST(root.right, max, root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.left.right = new Node(14);
        root.right.right = new Node(21);

        if (isBST(root)){
            System.out.println("Tree is BST");
        } else {
            System.out.println("Tree is Not BST");
        }
    }
}
