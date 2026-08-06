
public class QueueArrayBased {
	
	// attributes in Queue Array-Based
	private int[] queue;
	private final int MAX_SIZE = 50;
	private int size;
	
	// create an empty queue with default capacity
	public QueueArrayBased() {
		queue = new int[MAX_SIZE];
		size = 0;  // no element in queue
	}
	
	// create an empty queue with a specific capacity
	public QueueArrayBased(int capacity) {
		queue = new int[capacity];
		size = 0;  // no element in queue
	}
	
	public boolean isEmpty() {

		return false;
	}
	
	public boolean isFull() {
		return size == queue.length-1;
	}
	
	public boolean enqueue(int new_element) {
		if (!isFull()) {
			queue[size] = new_element;
			size++;
			
			return true;
		}

		return false;
	}
	
	public int peek() {
	  if (isEmpty()) {
		  return -1;
	  }
	  return queue[0];
	}

	public int dequeue() {
      if (!isEmpty()) {
    	  int temp = queue[0];
    	  for (int i=1; i<queue.length; i++) {
    		  queue[i-1] = queue[i];
    	  }
    	  size--;
    	  return temp;
      }
		return -1;
	}
}








