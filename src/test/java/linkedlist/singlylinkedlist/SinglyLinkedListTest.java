package linkedlist.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {


    @Test
    public void testAddToFront() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.addToFront(1);
        sll.addToFront(2);
        sll.addToFront(3);
        sll.addToFront(4);
        sll.addToFront(5);

        Assert.assertEquals("5 4 3 2 1", sll.toString());
    }

    @Test
    public void testAddToBack() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        Assert.assertEquals("1 2 3 4 5", sll.toString());
    }


    @Test
    public void testRemoveFront() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromFront();

        Assert.assertEquals("2 3 4 5", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.removeFromFront();
        Assert.assertEquals("", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.addToFront(666);
        sll.removeFromFront();
        Assert.assertEquals("", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromFront();
        Assert.assertEquals("666", sll.toString());

    }

    @Test
    public void testRemoveBack() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.addToBack(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToBack(4);
        sll.addToBack(5);

        sll.removeFromBack();
        Assert.assertEquals("1 2 3 4", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.removeFromBack();
        Assert.assertEquals("", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.addToFront(666);
        sll.removeFromBack();
        Assert.assertEquals("", sll.toString());

        sll = new SinglyLinkedList<>();
        sll.addToFront(666);
        sll.addToFront(333);
        sll.removeFromBack();
        Assert.assertEquals("333", sll.toString());

    }

}
