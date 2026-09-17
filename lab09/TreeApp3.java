
public class TreeApp3 {

	public static void main(String[] args) {
	   
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println();
		tree.searchDeleteNode(14);
		System.out.println ("Delete Node = " + tree.getDeleteNode().data);
		System.out.println ("Parent = " + tree.getParent().data);
		
		
	int taget = 14;
	tree.delete(target);
	tree.printTree(tree.getRoot(), 0);
	
	private Node parent;
	private Node deleteNode;
	 
	public Node getParent() {
	    return parent;
	}
	 
	public Node getDeleteNode() {
	    return deleteNode;
	}
	 
	public void searchDeleteNode(int target) {
	    parent = root;
	    Node current = root;
	    deleteNode = null;
	 
	    while (current != null) {
	        if (target == current.data) {
	            deleteNode = current;
	            break;
	        }
	        parent = current;
	        if (target < current.data) {
	            current = current.left;
	        } else {
	            current = current.right;
	        }
	    }
	}
	 
	public void delete(int target) {
	    searchDeleteNode(target);
	 
	    if (deleteNode == null) {
	        System.out.println("Cannot found Node(data=" + target + ")");
	        return;
	    }
	 
	    if (deleteNode.left != null && deleteNode.right != null) {
	        Node minParent = deleteNode;
	        Node minNode = deleteNode.right;
	 
	        while (minNode.left != null) {
	            minParent = minNode;
	            minNode = minNode.left;
	        }
	 
	        deleteNode.data = minNode.data;
	 
	        if (minParent == deleteNode) {
	            minParent.right = minNode.right;
	        } else {
	            minParent.left = minNode.right;
	        }
	        return;
	    }
	 
	    if (deleteNode.left != null || deleteNode.right != null) {
	        Node child = (deleteNode.left != null) ? deleteNode.left : deleteNode.right;
	 
	        if (deleteNode == root) {
	            root = child;
	        } else if (target < parent.data) {
	            parent.left = child;
	        } else {
	            parent.right = child;
	        }
	        return;
	    }
	 
	    if (deleteNode == root) {
	        root = null;
	    } else if (target < parent.data) {
	        parent.left = null;
	    } else {
	        parent.right = null;
	    }
	}
	 

	}

}
