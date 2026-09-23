
public class BSTApp1 {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.sampleTree1();

		Node minNode = bst.findMinimum();
		Node maxNode = bst.findMaximum();

		System.out.println("Minimum Node is " + minNode.data);
		System.out.println("Maximum Node is " + maxNode.data);
		System.out.println("Is 15 in BST => " + bst.findSpecificData(15));

		
		int delNode = 60;
		bst.searchDeleteNode(delNode);

		System.out.println("Parent is " + bst.getParent().data);
		System.out.println("Delete Node is " + bst.getDeleteNode().data);
		
		bst.delete(delNode);
		bst.printTree(bst.getRoot(), 0);
	}
}