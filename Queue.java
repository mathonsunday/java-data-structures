public class Queue {
	Node first;
	Node last;

	public Queue(Node first, Node last) {
		this.first = first;
		this.last = last;
		first.next = last;
	}

	public void enqueue(Object data) {
		if( first == null ) {
			last = new Node(data);
			first = last;
		} else {
			last.next = new Node(data);
			last = last.next;
		}
	}

	public Object dequeue() {
		if (first != null) {
			Object item = first.data;
			first = first.next;
			return item;
		}
		else {
			return null;
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
		Object data;
		Node next;

		private Node(Object d) {
			data = d;
		}
	}
}