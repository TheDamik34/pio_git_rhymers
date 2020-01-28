package edu.kis.vh.nursery;

/**
 *  Class which count Rhymer
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_CAPACITY = 12;
    private static final int STACK_FULL = ARRAY_CAPACITY - 1;
    private static final int STACK_EMPTY = -1;
    private static final int ERROR_VALUE = -1;

    private final int[] numbers = new int[ARRAY_CAPACITY];

    private int actualIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++actualIndex] = in;
    }

    boolean callCheck() {
        return actualIndex == STACK_EMPTY;
    }

    boolean isFull() {
        return actualIndex == STACK_FULL;
    }

    int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return getNumbers()[actualIndex];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return getNumbers()[actualIndex--];
    }

    public int getActualIndex() {
        return actualIndex;
    }

    private int[] getNumbers() {
        return numbers;
    }
}
