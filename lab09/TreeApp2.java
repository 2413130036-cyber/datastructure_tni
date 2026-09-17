
public class TreeApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Binary tree = new BinaryTree();
		tree.printTree(tree.getRoot(), 0);class Node {
		    int data;
		    Node left, right;
		 
		    Node(int data) {
		        this.data = data;
		    }
		}
		 
		public class BinaryTree {
		    Node root;
//1		 
		    public void createTree5() {
		        root = new Node(50);
		 
		        root.left = new Node(30);
		        root.right = new Node(70);
		 
		        root.left.left = new Node(10);
		        root.left.right = new Node(40);
		 
		        root.left.left.right = new Node(20);
		        root.left.left.right.right = new Node(25);
		 
		        root.left.right.right = new Node(45);
		 
		        root.right.left = new Node(60);
		 
		        root.right.left.left = new Node(55);
		        root.right.left.right = new Node(65);
		    }
//2
		    public void createTree6() {
		        root = new Node(40);
		 
		        root.left = new Node(20);
		        root.right = new Node(70);
		 
		        root.left.right = new Node(30);
		        root.left.right.left = new Node(25);
		        root.left.right.right = new Node(35);
		        root.left.right.right.left = new Node(32);
		 
		        root.right.left = new Node(55);
		        root.right.right = new Node(85);
		        root.right.right.left = new Node(80);
		    }
		}
	}

}

//3          

public class TreeApp2 {
public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.createTree4();
    System.out.println("-------------------------------");
    System.out.println("Binary Tree from createTree4()");
    System.out.println("-------------------------------");
    tree.displayTree();

    tree.createTree5();
    System.out.println("-------------------------------");
    System.out.println("Binary Tree from createTree5()");
    System.out.println("-------------------------------");
    tree.displayTree();

    tree.createTree6();
    System.out.println("-------------------------------");
    System.out.println("Binary Tree from createTree6()");
    System.out.println("-------------------------------");
    tree.displayTree();
    }

public void displayTree() {
    displayTree(root, 0);
}
 
private void displayTree(Node node, int level) {
    if (node == null) {
        return;
    }
    displayTree(node.right, level + 1);
    for (int i = 0; i < level; i++) {
        System.out.print("    ");
    }
    System.out.println(node.data);
    displayTree(node.left, level + 1);
}
 
}

