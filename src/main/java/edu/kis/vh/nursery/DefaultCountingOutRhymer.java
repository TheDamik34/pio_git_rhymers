package edu.kis.vh.nursery;

/**
 *  Class which count Rhymer
 */
public class DefaultCountingOutRhymer {

    private final int[] numbers = new int[12];

    private int total = -1;

    private static final int ARRAY_CAPACITY = 12;
    private static final int STACK_FULL = ARRAY_CAPACITY - 1;
    private static final int STACK_EMPTY = -1;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    boolean callCheck() {
        return total == STACK_EMPTY;
    }

    boolean isFull() {
        return total == STACK_FULL;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_EMPTY;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY;
        return getNumbers()[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
