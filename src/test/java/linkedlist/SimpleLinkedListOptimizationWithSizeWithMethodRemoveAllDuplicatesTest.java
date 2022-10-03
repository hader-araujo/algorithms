package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicatesTest {

    @Test
    public void emptySLL() {
        var expectedData = new Integer[]{};
        var sll = new SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates();
        Arrays.asList().forEach(sll::addToBack);

        sll.removeAllDuplicates();

        Assert.assertArrayEquals(expectedData, sll.toArray());
    }

    @Test
    public void oneValue() {
        var expectedData = new Integer[]{5};
        var sll = new SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates();
        Arrays.asList(5).forEach(sll::addToBack);

        sll.removeAllDuplicates();

        Assert.assertArrayEquals(expectedData, sll.toArray());
    }

    @Test
    public void noDuplicate() {
        var expectedData = new Integer[]{5, 7};
        var sll = new SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates();
        Arrays.asList(5, 7).forEach(sll::addToBack);

        sll.removeAllDuplicates();

        Assert.assertArrayEquals(expectedData, sll.toArray());
    }

    @Test
    public void oneDuplicate() {
        var expectedData = new Integer[]{5, 7};
        var sll = new SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates();
        Arrays.asList(5, 5, 7).forEach(sll::addToBack);

        sll.removeAllDuplicates();

        Assert.assertArrayEquals(expectedData, sll.toArray());
    }

    @Test
    public void twoDuplicates() {
        var expectedData = new Integer[]{3, 4, 7, 8, 9};
        var sll = new SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates();
        Arrays.asList(3, 3, 4, 7, 7, 8, 9).forEach(sll::addToBack);

        sll.removeAllDuplicates();

        Assert.assertArrayEquals(expectedData, sll.toArray());
    }

}
