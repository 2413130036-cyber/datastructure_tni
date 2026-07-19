public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	//1
	public String traversal() {
		Node node = head;
		String result = "[";
		while (node != null) {
			result += node.data;
			if (node.next != null) {
				result += ", ";
			}
			node = node.next;
		}
		result += "]";
		return result;
	}

	public void insert(int position, Object value) {
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else if (position == 0) {
			//2
			new_node.next = head;
			head = new_node;
		} else {
			//3
			Node node = head;
			int curr_position = 0;
			while (node != null && curr_position < position - 1) {
				node = node.next;
				curr_position++;
			}
			new_node.next = node.next;
			node.next = new_node;
		}
	}

	//4
	public void insert(Object value) {
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new_node;
		}
	}

	public void remove(int position) {
		if (position == 0) {
			//5
			Node node = head;
			head = node.next;
		} else {
			//6
			Node node = head;
			int curr_position = 0;
			while (node.next.next != null && curr_position < position - 1) {
				node = node.next;
				curr_position++;
			}
			if (node.next != null) {
				node.next = node.next.next;
			}
		}
	}

	//7
	public void removeLastElement() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			} else {
				Node node = head;
				while (node.next.next != null) {
					node = node.next;
				}
				node.next = null;
			}
		}
	}

	//8
	public int length() {
		Node node = head;
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	//9
	public Object get(int position) {
		Node node = head;
		int curr_position = 0;
		while (node != null && curr_position < position) {
			node = node.next;
			curr_position++;
		}
		return (node != null) ? node.data : null;
	}

	//10
	public void set(int position, Object value) {
		Node node = head;
		int curr_position = 0;
		while (node != null && curr_position < position) {
			node = node.next;
			curr_position++;
		}
		if (node != null) {
			node.data = value;
		}
	}

	//11
	public void clear() {
		head = null;
	}
}