package my.ds.tree.binarySearch;

public class BinarySearchTreeByLinkedListMain {

    public static void main(String[] args) {
        //Constructor
        BinarySearchTreeByLinkedList tree = new BinarySearchTreeByLinkedList();

        //Inserting values in BST
        System.out.println("Inserting 10 nodes in Tree");
        tree.insert(100);
        tree.insert(80);
        tree.insert(70);
        tree.insert(90);
        tree.insert(50);



        tree.printTreeGraphicallyBinarySearch();

        //Searching non-existing value in Tree
        System.out.println("\n\nSearching for value on BST...");
        tree.searchForValue(80);

        //Searching existing value in Tree
        System.out.println("\nSearching for value on BST...");
        tree.searchForValue(60);


        //Deleting Node from Tree
        tree.deleteNodeOfBST(80); //Node does not exists
        tree.printTreeGraphicallyBinarySearch();

		tree.deleteNodeOfBST(57); //Node is having 0 Child
		tree.printTreeGraphicallyBinarySearch();

		tree.deleteNodeOfBST(60); //Node is having 1 Child
		tree.printTreeGraphicallyBinarySearch();

		tree.deleteNodeOfBST(50); //Node is having 2 Child
		tree.printTreeGraphicallyBinarySearch();

		//Deleting entire Tree
		tree.deleteTree();

		//Traversing Tree
		tree.levelOrderTraversal();
    }
}
