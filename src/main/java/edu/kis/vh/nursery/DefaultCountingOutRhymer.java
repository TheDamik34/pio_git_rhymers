package edu.kis.vh.nursery;

/**
 *  Class which count Rhymer
 */
public class DefaultCountingOutRhymer implements DataStructureOperation {
    IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    @Override
    public void countIn(int in) {
        stack.countIn(in);
    }

    @Override
    public boolean callCheck() {
        return stack.callCheck();
    }

    @Override
    public boolean isFull() {
        return stack.isFull();
    }

    @Override
    public int peekaboo() {
        return stack.peekaboo();
    }

    @Override
    public int countOut() {
        return stack.countOut();
    }

    @Override
    public int getTotal() {
        return stack.getTotal();
    }

    @Override
    public int[] getNUMBERS() {
        return stack.getNUMBERS();
    }
}
