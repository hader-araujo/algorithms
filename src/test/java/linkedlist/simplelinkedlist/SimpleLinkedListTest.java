package linkedlist.simplelinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLinkedListTest {


    @Test
    public void testAddToFront() {
        SimpleLinkedList<Integer> sll = new SimpleLinkedList<>();

        sll.addToFront(1);
        sll.addToFront(2);
        sll.addToFront(3);
        sll.addToFront(4);
        sll.addToFront(5);

        Assert.assertEquals("5 4 3 2 1", sll.toString());
    }

    @Test
    public void testAddToBack() {
        SimpleLinkedList<Integer> sll = new SimpleLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        Assert.assertEquals("1 2 3 4 5", sll.toString());
    }


    @Test
    public void testRemoveFront() {
        SimpleLinkedList<Integer> sll = new SimpleLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromFront();

        Assert.assertEquals("2 3 4 5", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.removeFromFront();
        Assert.assertEquals("", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.addToFront(666);
        sll.removeFromFront();
        Assert.assertEquals("", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromFront();
        Assert.assertEquals("666", sll.toString());

    }

    @Test
    public void testRemoveBack() {
        SimpleLinkedList<Integer> sll = new SimpleLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromBack();
        Assert.assertEquals("1 2 3 4", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.removeFromBack();
        Assert.assertEquals("", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.addToFront(666);
        sll.removeFromBack();
        Assert.assertEquals("", sll.toString());

        sll = new SimpleLinkedList<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromBack();
        Assert.assertEquals("333", sll.toString());

    }

}
