package my.ds.tree.avlTree;

import my.ds.tree.node.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

import static my.ds.tree.constant.Constant.printTreeGraphically;

public class AVLTree {

    BinaryNode root;

    public AVLTree() {
        root = null;
    }


    public BinaryNode getRoot() {
        return root;
    }

    public void insert(int value) {
        insert(root, value);
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {

        if (currentNode == null) {
            System.out.println("Successfully inserted \" + value + \" in AVL Tree");
            return createNewNode(value);
        } else if (value <= currentNode.getValue()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
        } else {
            currentNode.setRight(insert(currentNode.getRight(), value));
        }

        // THIS IS WHERE WE WILL DO AVL SPECIFIC WORK
        currentNode = getBinaryNode(currentNode);

        return currentNode;
    }

    public BinaryNode createNewNode(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        node.setHeight(0);// Since this is a leaf node, its height is 0
        return node;
    }

    void levelOrderTraversal() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        System.out.println("Printing Level order traversal of AVL Tree...");
        if (root == null) {
            System.out.println("Tree does not exists !");
            return;
        }
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getValue() + " ");
            if (presentNode.getLeft() != null)
                queue.add(presentNode.getLeft());
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
    }

    public void printTreeGraphicallyAVLTree() {
        printTreeGraphically(root);
    }

    public void deleteNodeOfBST(int value) {
        System.out.println("Deleting " + value + " from AVL Tree ...");
        root = deleteNodeOfBST(root, value);
    }

    private BinaryNode deleteNodeOfBST(BinaryNode currentNode, int value) {

        // THIS ELSE_IF BLOCK IS BST CONDITION
        if (currentNode == null)
            return null;
        if (value < currentNode.getValue()) {
            currentNode.setLeft(deleteNodeOfBST(currentNode.getLeft(), value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRight(deleteNodeOfBST(currentNode.getRight(), value));
        } else {// If currentNode is the node to be deleted
            if (currentNode.getLeft() != null && currentNode.getRight() != null) { // if nodeToBeDeleted have both children
                BinaryNode temp = currentNode;
                BinaryNode minNodeForRight = minimumElement(temp.getRight());// Finding minimum element from right subtree
                currentNode.setValue(minNodeForRight.getValue()); // Replacing current node with minimum node from right subtree
                deleteNodeOfBST(currentNode.getRight(), minNodeForRight.getValue());// Deleting minimum node from right now
            } else if (currentNode.getLeft() != null) {// if nodeToBeDeleted has only left child
                currentNode = currentNode.getLeft();
            } else if (currentNode.getRight() != null) {// if nodeToBeDeleted has only right child
                currentNode = currentNode.getRight();
            } else { // if nodeToBeDeleted do not have child (Leaf node)
                //System.out.println("This node is leaf node");
                currentNode = null;
            }
            return currentNode;// if it is a leaf node,then no need to do balancing for this node, do only for its ancestors
        }

        // THIS IS WHERE WE WILL DO AVL SPECIFIC WORK
        currentNode = getBinaryNode(currentNode);
        return currentNode;
    }

    private int checkBalance(BinaryNode rootLeft, BinaryNode rootRight) {
        if ((rootLeft == null) && (rootRight == null)) { //if current node is a leaf node then no need to check balance of its children
            return 0;
        } else if (rootLeft == null) {
            return -1 * (rootRight.getHeight() + 1); // if left node node is not there then simply return right node's
            // height + 1
            // we need to make it -1 because blank height is considered
            // having height as '-1'
        } else if (rootRight == null) {
            return rootLeft.getHeight() + 1;
        } else {
            return rootLeft.getHeight() - rootRight.getHeight(); // +1 is not required, as both right and left child
            // exits and 1 gets nullified
        }
    }

    private BinaryNode rightRotate(BinaryNode currentNode) {
        BinaryNode newRoot = currentNode.getLeft();
        currentNode.setLeft(currentNode.getLeft().getRight());
        newRoot.setRight(currentNode);
        currentNode.setHeight(calculateHeight(currentNode));
        newRoot.setHeight(calculateHeight(newRoot));
        return newRoot;
    }

    private BinaryNode leftRotate(BinaryNode currentNode) {
        BinaryNode newRoot = currentNode.getRight();
        currentNode.setRight(currentNode.getRight().getLeft());
        newRoot.setLeft(currentNode);
        currentNode.setHeight(calculateHeight(currentNode));
        newRoot.setHeight(calculateHeight(newRoot));
        return newRoot;
    }

    private int calculateHeight(BinaryNode currentNode) {
        if (currentNode == null) {
            return 0;
        }
        return 1 + Math.max((currentNode.getLeft() != null ? currentNode.getLeft().getHeight() : -1),
                (currentNode.getRight() != null ? currentNode.getRight().getHeight() : -1));
    }

    public static BinaryNode minimumElement(BinaryNode root) {
        if (root.getLeft() == null)
            return root;
        else {
            return minimumElement(root.getLeft());
        }
    }

    private BinaryNode getBinaryNode(BinaryNode currentNode) {
        int balance = checkBalance(currentNode.getLeft(), currentNode.getRight());
        if (balance > 1) {
            if (checkBalance(currentNode.getLeft().getLeft(), currentNode.getLeft().getRight()) > 0) {
                currentNode = rightRotate(currentNode);
            } else {
                currentNode.setLeft(leftRotate(currentNode.getLeft()));
                currentNode = rightRotate(currentNode);
            }
        } else if (balance < -1) {
            if (checkBalance(currentNode.getRight().getRight(), currentNode.getRight().getLeft()) > 0) {
                currentNode = leftRotate(currentNode);
            } else {
                currentNode.setRight(rightRotate(currentNode.getRight()));
                currentNode = leftRotate(currentNode);
            }
        }

        if (currentNode.getLeft() != null) {
            currentNode.getLeft().setHeight(calculateHeight(currentNode.getLeft()));
        }
        if (currentNode.getRight() != null) {
            currentNode.getRight().setHeight(calculateHeight(currentNode.getRight()));
        }

        currentNode.setHeight(calculateHeight(currentNode));
        return currentNode;
    }
}
