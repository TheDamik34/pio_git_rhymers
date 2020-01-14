package edu.kis.vh.nursery;

/**
 *  Class which count Rhymer
 */
public class DefaultCountingOutRhymer {
    IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public int[] getNUMBERS() {
        return stack.getNUMBERS();
    }
}
