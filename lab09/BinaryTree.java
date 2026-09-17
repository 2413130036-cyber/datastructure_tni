public class BinaryTree {
 
	private Node root;
 
	public BinaryTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}
 
	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}
	
	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}
	
	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.right = new Node(23);
		root.left.left = new Node(4);
		root.left.left.left = new Node(2);
		root.left.right = new Node(11);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);
	}
	
	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(22);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);
	}
	
}

public void searchDeleteNode(int target) {
	
	Queue<Node> queue = new ArrayDeque<Node>();
	queue.add(root);

  while (!queue.isEmpty()) {
	  int levelSize = queue.size();
	  Node current_node = queue.poll();
	  parent = current_node;
	  if (parent.data == target) {
		  deleteNode = parent;
		  break;
		  
	  }s
	  for (int i=0; i<levelSize; i++) {
		  if(current_node.left != null) {
			  deleteNode = current_node.left;
			  queue.clear();
			  break;
		  }
		  queue.add(current_node.left);
	    }
	    if(current_node.right.data == target) {
		    deleteNode = current_node.right;
		    queue clear();
		    break;
	      }
	        queue.add(current_node.right);
      
    	}//end for
	  }//end while
	}//end method
	
	public void searchDeleteNode(int target) {
		 
	    parent = null;
	    deleteNode = null;
	 
	    if (root == null) {
	        return;
	    }
	 
	    if (root.data == target) {
	        deleteNode = root;
	        parent = root;
	        return;
	    }
	 
	    Queue<Node> queue = new ArrayDeque<Node>();
	    queue.add(root);
	 
	    while (!queue.isEmpty()) {
	        Node current_node = queue.poll();
	 
	        if (current_node.left != null) {
	            if (current_node.left.data == target) {
	                deleteNode = current_node.left;
	                parent = current_node;
	                return;
	            }
	            queue.add(current_node.left);
	        }
	 
	        if (current_node.right != null) {
	            if (current_node.right.data == target) {
	                deleteNode = current_node.right;
	                parent = current_node;
	                return;
	            }
	            queue.add(current_node.right);
	        }
	 
	    }//end while
	}//end method
	 
	public void delete(int target) {
	    searchDeleteNode(target);
	 
	    if (root == null) {
	        System.out.println("empty Tree");
	 
	    } else if (deleteNode == null) {
	        System.out.println("Cannot found the delete node");
	 
	    } else {
	 
	        //case1
	        if (deleteNode.left == null && deleteNode.right == null) {
	            if (deleteNode == root) {
	                root = null;
	            } else if (parent.left != null && parent.left.data == target) {
	                parent.left = null;
	            } else {
	                parent.right = null;
	            }
	 
	        //case2
	        } else if (deleteNode.left != null && deleteNode.right != null) {
	            Node successorParent = deleteNode;
	            Node successor = deleteNode.right;
	 
	            while (successor.left != null) {
	                successorParent = successor;
	                successor = successor.left;
	            }
	            deleteNode.data = successor.data;
	 
	            if (successorParent.left == successor) {
	                successorParent.left = successor.right;
	            } else {
	                successorParent.right = successor.right;
	            }
	 
	        //case3
	        } else {
	            Node child = (deleteNode.left != null) ? deleteNode.left : deleteNode.right;
	 
	            if (deleteNode == root) {
	                root = child;
	            } else if (parent.left != null && parent.left.data == target) {
	                parent.left = child;
	            } else {
	                parent.right = child;
	            }
	        }
	    }
	}
	 