package Pertemuan10;

public class StrukturStack {
    private Stack stack;

    public StrukturStack(int capacity) {
        stack = new Stack(capacity);
    }

    public void push(int data) {
        stack.push(data);
    }

    public int pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }
    // ...existing code...

    public int size() {
        return stack.size();
    }

    public int getTop() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public void print() {
        stack.print();
    }
}