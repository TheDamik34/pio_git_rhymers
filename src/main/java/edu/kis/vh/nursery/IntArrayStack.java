package edu.kis.vh.nursery;

public class IntArrayStack {

    private final int[] NUMBERS = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    boolean callCheck() {
        return total == -1;
    }

    boolean isFull() {
        return total == 11;
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
