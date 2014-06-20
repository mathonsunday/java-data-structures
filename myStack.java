	// TODO
	// add generics

	public class myStack {
		Node top;

		Object pop() {
			if (top != null) {
				Object item = top.data;
				System.out.println(top.next);
				top = top.next;
				return item;
			}
			return null;
		}

		void push(Object item) {
			Node t = new Node(item);
			t.next = top;
			top = t;
		}

		Object peek() {
			if(top != null) {
				return top.data;
			}
			return null;
		}

		public static void main(String[] args) {
			myStack stack = new myStack();
			stack.push(3);
			System.out.println(stack.peek() == 3);
			System.out.println(stack.pop());
			stack.push(2);
			System.out.println(stack.peek() == 2);
		}

		private static class Node {
			Object data;
			Node next;

			private Node(Object data) {
				this.data = data;
			}
		}
	}