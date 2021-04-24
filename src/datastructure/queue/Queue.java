package datastructure.queue;

public class Queue {

    private long maxSize;
    private long[] que;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.que = new long[size];
        front = 0;
        rear = -1;
    }

    public void insert(long item) {
        //Below condition makes it a circular queue
        if (rear == (maxSize - 1)) {
            rear = -1;
        }
        rear++;
        que[rear] = item;
        nItems++;
    }

    public long remove() {
        long result = que[front];
        front++;
        nItems--;
        if (front == maxSize) {
            front = 0;
        }
        return result;
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < que.length; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.print("]");
    }

    public long peekFront() {
        return que[front];
    }

    public boolean isFull() {
        return maxSize == nItems;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }
}


