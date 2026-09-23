
public class BinarySearchTree {

	private Node root;
	private Node parent;
	private Node deleteNode;

	public boolean isEmpty() {
		return root == null;
	}
	
	public void sampleTree1() {
		int[] nums = {20,10,60,7,11,30,65,3,40};
		
		for (int num : nums) {
			insert(num);
		}
	}
	
	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public Node getDeleteNode() {
		return deleteNode;
	}
	
	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				}
				else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right; 
				}
				
			} //end while
		} //end if
	}
	
	public Node findMinimum() {
		if (isEmpty()) {
			return null;
		}else {
			Node current_node = root;
			if (current_node.left == null) {
				return current_node;
			}
			while (current_node != null) {
				current_node = current_node.left;
				if (current_node.left == null) {
					return current_node;
				}
			}
		}
		return null;
	}

	public Node findMaximum() {
	    return findMaximum(root);
	}
	


	private Node findMaximum(Node node) {
	    if (node == null) {
	        return null;
	    }

	    while (node.right != null) {
	        node = node.right;
	    }
	    return node;
	}
	
	public void searchDeleteNode(int target) {
		parent = root;
		Node current_node = root;
		while (current_node != null) {
			if (current_node.data == target) {
				deleteNode = current_node;
				break;
			}
			parent = current_node;
			if (target < current_node.data) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}
	}
	public void delete(int target) {
		searchDeleteNode(target);

		if (deleteNode == null) {
			System.out.println(target + " not found in BST");
			return;
		}

		// กรณีที่ 1: Leaf Node
		if (deleteNode.left == null && deleteNode.right == null) {
			deleteLeafNode();
		}
		// กรณีที่ 2: มี 1 Subtree (มีลูกด้านเดียว)
		else if (deleteNode.left == null || deleteNode.right == null) {
			deleteNodeWithOneChild();
		}
		// กรณีที่ 3: มี 2 Subtree
		else {
			deleteNodeWithTwoChildren();
		}
	}

	// Case 1
	private void deleteLeafNode() {
		if (parent == null) {
			root = null;
		} else if (parent.left == deleteNode) {
			parent.left = null;
		} else {
			parent.right = null;
		}
	}

	// Case 2
	private void deleteNodeWithOneChild() {
		Node child = (deleteNode.left != null) ? deleteNode.left : deleteNode.right;

		if (parent == null) {
			root = child;
		} else if (parent.left == deleteNode) {
			parent.left = child;
		} else {
			parent.right = child;
		}
	}

	// Case 3
	private void deleteNodeWithTwoChildren() {
		replaceByMaxInLeftSubtree();
	}

	// Case 3.1
	private void replaceByMaxInLeftSubtree() {
		Node replaceParent = deleteNode;
		Node replaceNode = deleteNode.left;

		while (replaceNode.right != null) {
			replaceParent = replaceNode;
			replaceNode = replaceNode.right;
		}

		deleteNode.data = replaceNode.data;

		if (replaceParent.left == replaceNode) {
			replaceParent.left = replaceNode.left;
		} else {
			replaceParent.right = replaceNode.left;
		}
	}

	// Case3.2
	private void replaceByMinInRightSubtree() {
		Node replaceParent = deleteNode;
		Node replaceNode = deleteNode.right;

		while (replaceNode.left != null) {
			replaceParent = replaceNode;
			replaceNode = replaceNode.left;
		}

		deleteNode.data = replaceNode.data;

		if (replaceParent.left == replaceNode) {
			replaceParent.left = replaceNode.right;
		} else {
			replaceParent.right = replaceNode.right;
		}
	}
	public boolean findSpecificData(int target) {
		Node current_node = root;

		while (current_node != null) {
			if (target == current_node.data) {
				return true;
			} else if (target < current_node.data) {
				current_node = current_node.left;
			} else {
				current_node = current_node.right;
			}
		}

		return false;
	}

} 
 

