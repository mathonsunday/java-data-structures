			// delete doesn't handle case where linkedlist has less than 3 elements

			public class LinkedList {
				Node head;

				public void appendToTail(int data) {
					if(head == null) head = new Node(data);
					Node current = head;
					while(current.next != null) {
						current = current.next;
					}
					current.next = new Node(data);
				}

				public Node find(int data) {
					if(head == null) return null;
					Node current = head;
					while(current.next != null) {
						if(current.data == data) return current;
						current = current.next;
					}
					return null;
				}

				public void delete(int data) {
					Node current = head;

					if(current.data == data) {
					 head = head.next;
					}

					while(current.next != null) {
						if(current.next.data == data) {
						current.next = current.next.next;
						return;
					}
					current = current.next;
				}
					return;
				}

				public static void main(String[] args) {
					LinkedList linkedlist = new LinkedList();
					linkedlist.appendToTail(3);
					linkedlist.appendToTail(4);
					linkedlist.appendToTail(5);
					System.out.println(linkedlist.find(3).data == 3);
					linkedlist.delete(4);
					System.out.println(linkedlist.find(4));
				}

				private static class Node {
					int data;
					Node next;

					private Node(int data) {
						this.data = data;
					}
				}
			}