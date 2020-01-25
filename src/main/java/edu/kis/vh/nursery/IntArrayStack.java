package edu.kis.vh.nursery;

public class IntArrayStack implements DataStructureOperation {

    private final int[] NUMBERS = new int[12];

    private int total = -1;

    @Override
    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
