package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class SimpleLinkedListOptimizationWithTailIterableTest {


    @Test
    public void testAddToFront() {
        SimpleLinkedListOptimizationWithTailIterable<Integer> sll = new SimpleLinkedListOptimizationWithTailIterable<>();

        sll.addToFront(1);
        sll.addToFront(2);
        sll.addToFront(3);
        sll.addToFront(4);
        sll.addToFront(5);

        Assert.assertEquals(5, sll.size());
        var expectedData = new Integer[]{5, 4, 3, 2, 1};

        int expectedIndex = 0;
        Iterator<Integer> it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }
    }

    @Test
    public void testAddToBack() {
        SimpleLinkedListOptimizationWithTailIterable<Integer> sll = new SimpleLinkedListOptimizationWithTailIterable<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        Assert.assertEquals(5, sll.size());
        var expectedData = new Integer[]{1, 2, 3, 4, 5};

        int expectedIndex = 0;
        Iterator<Integer> it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }
    }


    @Test
    public void testRemoveFront() {
        SimpleLinkedListOptimizationWithTailIterable<Integer> sll = new SimpleLinkedListOptimizationWithTailIterable<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromFront();
        Assert.assertEquals(4, sll.size());
        var expectedData = new Integer[]{2, 3, 4, 5};

        int expectedIndex = 0;
        Iterator<Integer> it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.removeFromFront();
        Assert.assertEquals(0, sll.size());
        expectedData = new Integer[]{};

        expectedIndex = 0;
        it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.addToFront(666);
        sll.removeFromFront();
        Assert.assertEquals(0, sll.size());
        expectedData = new Integer[]{};

        expectedIndex = 0;
        it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromFront();
        Assert.assertEquals(1, sll.size());
        expectedData = new Integer[]{666};

        expectedIndex = 0;
        it = sll.iterator();
        while (it.hasNext()) {
            Assert.assertEquals(it.next(), expectedData[expectedIndex++]);
        }

    }

    @Test
    public void testRemoveBack() {
        SimpleLinkedListOptimizationWithTailIterable<Integer> sll = new SimpleLinkedListOptimizationWithTailIterable<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromBack();
        Assert.assertEquals(4, sll.size());
        var expectedData = new Integer[]{1, 2, 3, 4};

        var expectedIndex = 0;
        for (var item : sll) {
            Assert.assertEquals(item, expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.removeFromBack();
        Assert.assertEquals(0, sll.size());
        expectedData = new Integer[]{};

        expectedIndex = 0;
        for (var item : sll) {
            Assert.assertEquals(item, expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.addToFront(666);
        sll.removeFromBack();
        Assert.assertEquals(0, sll.size());
        expectedData = new Integer[]{};

        expectedIndex = 0;
        for (var item : sll) {
            Assert.assertEquals(item, expectedData[expectedIndex++]);
        }


        sll = new SimpleLinkedListOptimizationWithTailIterable<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromBack();
        Assert.assertEquals(1, sll.size());
        expectedData = new Integer[]{333};

        expectedIndex = 0;
        for (var item : sll) {
            Assert.assertEquals(item, expectedData[expectedIndex++]);
        }

    }

}
