package adt.linear.queue;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBackedQueueWithTailTest {


    @Test
    public void emptyStack() {
        LinkedListBackedQueueWithTail<Integer> queue = new LinkedListBackedQueueWithTail<>();

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void oneValue() {
        LinkedListBackedQueueWithTail<Integer> queue = new LinkedListBackedQueueWithTail<>();

        queue.enqueue(66);

        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(66, (long) queue.peek());
        Assert.assertEquals(66, (long) queue.dequeue());
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void threeValues() {
        LinkedListBackedQueueWithTail<Integer> queue = new LinkedListBackedQueueWithTail<>();

        queue.enqueue(33);
        queue.enqueue(66);
        queue.enqueue(99);

        Assert.assertEquals(33, (long) queue.peek());
        Assert.assertEquals(33, (long) queue.dequeue());

        Assert.assertEquals(66, (long) queue.peek());
        Assert.assertEquals(66, (long) queue.dequeue());

        Assert.assertEquals(99, (long) queue.peek());
        Assert.assertEquals(99, (long) queue.dequeue());

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void clearValues() {
        LinkedListBackedQueueWithTail<Integer> queue = new LinkedListBackedQueueWithTail<>();

        queue.enqueue(33);
        queue.enqueue(66);
        queue.enqueue(99);

        queue.clear();

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }
}