package stack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListBackedStackTest {

    @Test
    public void emptyStack() {
        ArrayBackedStack<Integer> stack = new ArrayBackedStack<>();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peak());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void oneValue() {
        ArrayBackedStack<Integer> stack = new ArrayBackedStack<>();

        stack.push(66);

        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(66, (long) stack.peak());
        Assert.assertEquals(66, (long) stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void threeValues() {
        ArrayBackedStack<Integer> stack = new ArrayBackedStack<>();

        stack.push(33);
        stack.push(66);
        stack.push(99);

        Assert.assertEquals(99, (long) stack.peak());
        Assert.assertEquals(99, (long) stack.pop());

        Assert.assertEquals(66, (long) stack.peak());
        Assert.assertEquals(66, (long) stack.pop());

        Assert.assertEquals(33, (long) stack.peak());
        Assert.assertEquals(33, (long) stack.pop());

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peak());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void manyValues() {
        ArrayBackedStack<Integer> stack = new ArrayBackedStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);

        Assert.assertEquals(21, (long) stack.peak());
        Assert.assertEquals(21, (long) stack.pop());
        Assert.assertEquals(20, (long) stack.pop());
        Assert.assertEquals(19, (long) stack.pop());

        stack.push(19);
        stack.push(20);
        stack.push(21);
        
        Assert.assertEquals(21, (long) stack.peak());
    }

    @Test
    public void clearValues() {
        ArrayBackedStack<Integer> stack = new ArrayBackedStack<>();

        stack.push(33);
        stack.push(66);
        stack.push(99);

        stack.clear();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peak());
        Assert.assertNull(stack.pop());
    }
}