package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

/**
 *  RhymersJUnitTest class
 *  Tests list size, counting, etc.
 */
public class RhymersJUnitTest {

    DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
    final int EMPTY_STACK_VALUE = -1;
    final int STACK_CAPACITY = 12;
    final int testValue = 4;

    @Test
    public void testCountIn() {

        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {

        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test
    public void testPeekaboo() {

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
