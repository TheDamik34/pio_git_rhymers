package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    private static final int STACK_EMPTY = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return STACK_EMPTY;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return STACK_EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
