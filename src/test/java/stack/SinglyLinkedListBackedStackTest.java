package stack;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListBackedStackTest {

    @Test
    public void emptyStack() {
        SinglyLinkedListBackedStack<Integer> stack = new SinglyLinkedListBackedStack<>();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void oneValue() {
        SinglyLinkedListBackedStack<Integer> stack = new SinglyLinkedListBackedStack<>();

        stack.push(66);

        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(66, (long) stack.peek());
        Assert.assertEquals(66, (long) stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void threeValues() {
        SinglyLinkedListBackedStack<Integer> stack = new SinglyLinkedListBackedStack<>();

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
        SinglyLinkedListBackedStack<Integer> stack = new SinglyLinkedListBackedStack<>();

        stack.push(33);
        stack.push(66);
        stack.push(99);

        stack.clear();

        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());
    }
}