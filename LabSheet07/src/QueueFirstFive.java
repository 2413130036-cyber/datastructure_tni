import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstFive {

	public static void main(String[] args) {
		
		Queue<Integer> n_queue = new LinkedList<Integer>();
		
		for (int i = 101; i <= 110; i++) {
			n_queue.add(i);
		}
		
		System.out.println("Queue => " + n_queue);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(n_queue.toArray()[i]);
		}
		
		System.out.println("Queue => " + n_queue);
	}
}