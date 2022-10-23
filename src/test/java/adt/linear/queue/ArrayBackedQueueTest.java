package adt.linear.queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBackedQueueTest {

    @Test
    public void checkClearQueue() {
        ArrayBackedQueue<Integer> queue = new ArrayBackedQueue<>();

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void checkQueueAndDequeueOneObject() {
        ArrayBackedQueue<Integer> queue = new ArrayBackedQueue<>();

        queue.enqueue(10);

        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(10, (long) queue.peek());

        var valueDequeued = queue.dequeue();
        Assert.assertEquals(10, (long) valueDequeued);

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void checkQueueAndDequeue() {
        ArrayBackedQueue<Integer> queue = new ArrayBackedQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);

        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(2, (long) queue.peek());


        queue.enqueue(30);

        Assert.assertEquals(2, (long) queue.peek());
        Assert.assertEquals(2, (long) queue.dequeue());

        Assert.assertEquals(3, (long) queue.peek());
        Assert.assertEquals(3, (long) queue.dequeue());

        Assert.assertEquals(4, (long) queue.peek());
        Assert.assertEquals(4, (long) queue.dequeue());

        Assert.assertEquals(5, (long) queue.peek());
        Assert.assertEquals(5, (long) queue.dequeue());

        Assert.assertEquals(6, (long) queue.peek());
        Assert.assertEquals(6, (long) queue.dequeue());

        Assert.assertEquals(7, (long) queue.peek());
        Assert.assertEquals(7, (long) queue.dequeue());

        Assert.assertEquals(8, (long) queue.peek());
        Assert.assertEquals(8, (long) queue.dequeue());

        Assert.assertEquals(9, (long) queue.peek());
        Assert.assertEquals(9, (long) queue.dequeue());

        Assert.assertEquals(10, (long) queue.peek());
        Assert.assertEquals(10, (long) queue.dequeue());

        Assert.assertEquals(11, (long) queue.peek());
        Assert.assertEquals(11, (long) queue.dequeue());

        Assert.assertEquals(12, (long) queue.peek());
        Assert.assertEquals(12, (long) queue.dequeue());

        Assert.assertEquals(30, (long) queue.peek());
        Assert.assertEquals(30, (long) queue.dequeue());

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());

    }


    @Test
    public void dequeueWith10() {
        ArrayBackedQueue<Integer> queue = new ArrayBackedQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        Assert.assertFalse(queue.isEmpty());
        Assert.assertEquals(1, (long) queue.peek());

        Assert.assertEquals(1, (long) queue.peek());
        Assert.assertEquals(1, (long) queue.dequeue());

        Assert.assertEquals(2, (long) queue.peek());
        Assert.assertEquals(2, (long) queue.dequeue());

        Assert.assertEquals(3, (long) queue.peek());
        Assert.assertEquals(3, (long) queue.dequeue());


        queue.enqueue(50);
        queue.enqueue(51);
        queue.enqueue(52);

        Assert.assertEquals(4, (long) queue.peek());
        Assert.assertEquals(4, (long) queue.dequeue());

        Assert.assertEquals(5, (long) queue.peek());
        Assert.assertEquals(5, (long) queue.dequeue());

        Assert.assertEquals(6, (long) queue.peek());
        Assert.assertEquals(6, (long) queue.dequeue());

        Assert.assertEquals(7, (long) queue.peek());
        Assert.assertEquals(7, (long) queue.dequeue());

        Assert.assertEquals(8, (long) queue.peek());
        Assert.assertEquals(8, (long) queue.dequeue());

        Assert.assertEquals(9, (long) queue.peek());
        Assert.assertEquals(9, (long) queue.dequeue());

        Assert.assertEquals(10, (long) queue.peek());
        Assert.assertEquals(10, (long) queue.dequeue());

        Assert.assertEquals(50, (long) queue.peek());
        Assert.assertEquals(50, (long) queue.dequeue());

        Assert.assertEquals(51, (long) queue.peek());
        Assert.assertEquals(51, (long) queue.dequeue());

        Assert.assertEquals(52, (long) queue.peek());
        Assert.assertEquals(52, (long) queue.dequeue());


        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());

    }

    @Test
    public void clear() {
        ArrayBackedQueue<Integer> queue = new ArrayBackedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);

        queue.clear();

        Assert.assertTrue(queue.isEmpty());
        Assert.assertNull(queue.peek());
        Assert.assertNull(queue.dequeue());
    }


}