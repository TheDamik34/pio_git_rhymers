package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CHECK_VALUE = -1;
    private static final int CAPACITY = 12;
    private final int[] NUMBERS = new int[CAPACITY];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    boolean callCheck() {
        return total == CHECK_VALUE;
    }

    boolean isFull() {
        return total == CAPACITY - 1;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
