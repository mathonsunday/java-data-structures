// TODO
// add generics

public class myQueue {
	Node first;
	Node last;

	public myQueue(Node first, Node last) {
		this.first = first;
		this.last = last;
		first.next = last;
	}

	public myQueue() {

	}

	public void enqueue(Object data) {
		if( first == null ) {
			first = new Node(data);
			last = first;
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
		myQueue queue = new myQueue();
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.dequeue() == 4);
		System.out.println(queue.dequeue() == 5);
	}

	private static class Node {
		Object data;
		Node next;

		private Node(Object data) {
			this.data = data;
		}
	}
}