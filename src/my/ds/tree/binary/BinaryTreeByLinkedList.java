package my.ds.tree.binary;

import my.ds.tree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {

    BinaryNode root;

    public BinaryTreeByLinkedList() {
        this.root = null;
    }

    void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null){
            root = node;
            System.out.println("Successfully inserted new node at Root !");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                System.out.println("Successfully inserted new node !");
                break;
            } else if (presentNode.getRight() == null){
                presentNode.setRight(node);
                System.out.println("Successfully inserted new node !");
                break;
            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value){
                System.out.println("Value-"+value+" is found in Tree !");
                return;
            } else {
                if (presentNode.getLeft() != null){
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null){
                    queue.add(presentNode.getRight());
                }
            }
        }
        System.out.println("Value-"+value+" is not found in Tree !");
    }

    void deleteNodeOfBinaryTree(int value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.getValue() == value){
                presentNode.setValue(getDeepestNode().getValue());
                DeleteDeepestNode();
                System.out.println("Deleted the node !!");
            } else {
                if (presentNode.getLeft() != null)
                    queue.add(presentNode.getLeft());
                if (presentNode.getRight() != null)
                    queue.add(presentNode.getRight());
            }
        }
        System.out.println("Node is not found in tree...");
    }

    public void DeleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            }else if ((presentNode.getRight() == null)) {
                presentNode.setLeft(null);
                return;
            }
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null)
                queue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
        return presentNode;
    }

    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.println(node.getValue() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        preOrder(node.getLeft());
        preOrder(node.getRight());
        System.out.println(node.getValue() + " ");
    }

    void inOrder(BinaryNode node) {
        if (node == null)
            return;
        preOrder(node.getLeft());
        System.out.println(node.getValue() + " ");
        preOrder(node.getRight());
    }

    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null){
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null){
                queue.add(presentNode.getRight());
            }
        }
    }

    void deleteTree() {
        root = null;
        System.out.println("Binary Tree has been deleted successfully");
    }
}
