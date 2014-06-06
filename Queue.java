public class Queue {
	Node first;
	Node last;


	public Queue(Node f, Node l) {
		first = f;
		last = l;
		first.next = last;
	}

	public Queue() {
		
	}

	public void enqueue(int data) {
		if( first == null ) {
			last = new Node(data);
			first = last;
		} else {
			last.next = new Node(data);
			last = last.next;
		}
	}

	public int dequeue() {
		if (first != null) {
			int item = first.data;
			first = first.next;
			return item;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Queue queue = new Queue(new Node(2), new Node(3));
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.dequeue() == 2);
		System.out.println(queue.dequeue() == 3);
	}

	private static class Node {
		int data;
		Node next;

		private Node(int d) {
			data = d;
		}
	}
}