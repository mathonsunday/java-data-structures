import java.util.Arrays;

public class myStackArray<E> {
 private int size = 0;
 private static final int DEFAULT_CAPACITY = 10;
 private Object elements[];

 public myStackArray() {
  elements = new Object[DEFAULT_CAPACITY];
}

public void push(E e) {
  if (size == elements.length) {
   ensureCapa();
}
elements[size++] = e;
}

@SuppressWarnings("unchecked")
public E pop() {
  E e = (E) elements[--size];
  elements[size] = null;
  return e;
}

public E peek() {
   return (E) elements[size - 1];
}

private void ensureCapa() {
  int newSize = elements.length * 2;
  elements = Arrays.copyOf(elements, newSize);
}

public static void main(String[] args) {
   myStackArray<Integer> stack = new myStackArray<Integer>();
   stack.push(3);
   System.out.println(stack.peek() == 3);
   System.out.println(stack.pop());
   stack.push(2);
   System.out.println(stack.peek() == 2);
}
} 