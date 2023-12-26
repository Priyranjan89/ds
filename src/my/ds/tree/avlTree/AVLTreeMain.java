package my.ds.tree.avlTree;

public class AVLTreeMain {

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        // Insert values in AVL Tree


        avlTree.insert(30);


        avlTree.insert(10);
        avlTree.insert(5);
        avlTree.insert(3);
        avlTree.insert(4);
        avlTree.insert(50);
        avlTree.insert(65);
        avlTree.insert(1);

        avlTree.levelOrderTraversal();
        avlTree.printTreeGraphicallyAVLTree();

        avlTree.deleteNodeOfBST(5);//LL Condition
        avlTree.printTreeGraphicallyAVLTree();

        avlTree.insert(2);
        avlTree.printTreeGraphicallyAVLTree();

        avlTree.deleteNodeOfBST(4);//LR Condition
        avlTree.printTreeGraphicallyAVLTree();

        avlTree.insert(20);
        avlTree.deleteNodeOfBST(65);//RR Condition
        avlTree.printTreeGraphicallyAVLTree();

        avlTree.insert(40);
        avlTree.deleteNodeOfBST(20);//RL Condition
        avlTree.printTreeGraphicallyAVLTree();
    }
}
