package stack;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBackedStackTest {

    @Test
    public void emptyStack() {
        LinkedListBackedStack<Integer> stack = new LinkedListBackedStack<>();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void oneValue() {
        LinkedListBackedStack<Integer> stack = new LinkedListBackedStack<>();

        stack.push(66);

        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(66, (long) stack.peek());
        Assert.assertEquals(66, (long) stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void threeValues() {
        LinkedListBackedStack<Integer> stack = new LinkedListBackedStack<>();

        stack.push(33);
        stack.push(66);
        stack.push(99);

        Assert.assertEquals(99, (long) stack.peek());
        Assert.assertEquals(99, (long) stack.pop());

        Assert.assertEquals(66, (long) stack.peek());
        Assert.assertEquals(66, (long) stack.pop());

        Assert.assertEquals(33, (long) stack.peek());
        Assert.assertEquals(33, (long) stack.pop());

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void clearValues() {
        LinkedListBackedStack<Integer> stack = new LinkedListBackedStack<>();

        stack.push(33);
        stack.push(66);
        stack.push(99);

        stack.clear();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());
    }
}