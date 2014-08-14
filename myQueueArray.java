public class myQueueArray<T> {

    private T[] arr;

    private int total, first, next;

    public myQueueArray() {
        arr = (T[]) new Object[2];
    }

    private void resize(int capacity) {
        T[] tmp = (T[]) new Object[capacity];

        for (int i = 0; i < total; i++)
            tmp[i] = arr[(first + i) % arr.length];

        arr = tmp;
        first = 0;
        next = total;
    }

    public void enqueue(T ele) {
        if (arr.length == total) resize(arr.length * 2);
        arr[next++] = ele;
        if (next == arr.length) next = 0;
        total++;
    }

    public T dequeue() {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = arr[first];
        arr[first] = null;
        if (++first == arr.length) first = 0;
        if (--total > 0 && total == arr.length / 4) resize(arr.length / 2);
        return ele;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(arr);
    }

    public static void main(String[] args) {
        myQueueArray<Integer> queue = new myQueueArray<Integer>();
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue() == 4);
        System.out.println(queue.dequeue() == 5);
    }

}