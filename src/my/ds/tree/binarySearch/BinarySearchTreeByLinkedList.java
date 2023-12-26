package my.ds.tree.binarySearch;

import my.ds.tree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

import static my.ds.tree.constant.Constant.printTreeGraphically;

public class BinarySearchTreeByLinkedList {

    BinaryNode root;

    public BinaryNode getRoot() {
        return root;
    }

    BinarySearchTreeByLinkedList() {
        root = null;
    }

    void insert(int value) {
        root = insert(root, value);
    }

    public BinaryNode insert(BinaryNode currentNode, int value){
        if (currentNode == null) { // if root node is blank then insert new node there
            System.out.println("Successfully inserted " + value + " in BST");
            return createNewNode(value);
        } else if (value < currentNode.getValue()){
            currentNode.setLeft(insert(currentNode.getLeft(), value));
            return currentNode;
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
            return currentNode;
        }
    }

    public BinaryNode createNewNode(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        return node;
    }

    public void deleteNodeOfBST(int value) {
        System.out.println("\n\nDeleting " + value + " from BST...");
        deleteNodeOfBST(root, value);
    }

    public BinaryNode deleteNodeOfBST(BinaryNode root, int value) {

        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.getValue()){
            root.setLeft(deleteNodeOfBST(root.getLeft(), value));
        } else if (value > root.getValue()){
            root.setRight(deleteNodeOfBST(root.getRight(), value));
        } else {  // If currentNode is the node to be deleted
            root = getBinaryNode(root);
        }

        return root;
    }

    private BinaryNode getBinaryNode(BinaryNode root) {
        if (root.getLeft() != null && root.getRight() != null){  // if nodeToBeDeleted have both children
            BinaryNode tempNode = root;
            BinaryNode minNodeForRight = minimumElement(tempNode.getRight()); // Finding minimum element from right subtree
            root.setValue(minNodeForRight.getValue()); // Replacing current node with minimum node from right subtree
            root.setRight(deleteNodeOfBST(root.getRight(), minNodeForRight.getValue()));  // Deleting minimum node from right now
        } else if (root.getLeft() != null){ // if nodeToBeDeleted has only left child
            root = root.getLeft();
        }  else if (root.getRight() != null){ // if nodeToBeDeleted has only right child
            root = root.getRight();
        } else { // if nodeToBeDeleted do not have child (Leaf node)
            root = null;
        }
        return root;
    }

    public static BinaryNode minimumElement(BinaryNode root) {
        if (root.getLeft() == null)
            return root;
        else {
            return minimumElement(root.getLeft());
        }
    }

    void searchForValue(int value) {
        searchForValue(root, value);
    }

    BinaryNode searchForValue(BinaryNode node, int value){
        if (node == null){
            System.out.println("Value: " + value + " not found in BST.");
            return null;
        } else if (node.getValue() == value){
            System.out.println("Value: " + value + " found in BST.");
            return node;
        } else if (value < node.getValue()){
            return searchForValue(node.getLeft(), value);
        } else {
            return searchForValue(node.getRight(), value);
        }
    }

    void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        System.out.println("\nPrinting Level order traversal of Tree...");
        if (root == null) {
            System.out.println("Tree does not exists !");
            return;
        }
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.getValue() +" ");
            if (presentNode.getLeft() != null){
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null){
                queue.add(presentNode.getRight());
            }
        }
    }

    public void deleteTree() {
        System.out.println("Deleting entire Tree...");
        root = null;
        System.out.println("Tree deleted successfully !");
    }

    void printTreeGraphicallyBinarySearch() {

        printTreeGraphically(root);

    }
}
