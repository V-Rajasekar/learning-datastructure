package datastructure.stack;

public class Stack {
    int maxSize;
    int top;
    long [] items;


    public Stack(int size) {
        maxSize = size;
        items = new long[size];
        top = -1;
    }

    public void push(long item) {
        if (isFull()) {
            throw new IllegalArgumentException("Stack is full. Can't push more items");
        }
        top++;
        items[top] = item;
    }

    public long pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("The stack is already empty");
        }
        int old_top = top;
        top--;
        return items[old_top];
    }

    public long peek() {
        return items[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return top == maxSize -1;
    }

}

