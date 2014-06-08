	import java.util.Arrays;

	public class ArrayList<E> {
		private int size = 0;
		private static final int DEFAULT_CAPACITY = 10;
		private Object elements[];

		public ArrayList() {
			elements = new Object[DEFAULT_CAPACITY];
		}


		public void add(E element) {
			if (size == elements.length) {
				ensureCapacity();
			}
			elements[size++] = element;
		}

		public void remove(int index) {
			if (index >= size || index < 0) {
				throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
			}
			--size;
			System.arraycopy(elements, index + 1, elements, index, size - index);
			elements[size] = null;
		}

		@SuppressWarnings("unchecked")
		public E get(int index) {
			if (index >= size || index < 0) {
				throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
			}
			return (E) elements[index];
		}


		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		private void ensureCapacity() {
			int newSize = elements.length * 2;
			elements = Arrays.copyOf(elements, newSize);
		}

		public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.remove(1);
			System.out.println(list.get(1));
			System.out.println(list.size());
			System.out.println(list.isEmpty());
		}
	}