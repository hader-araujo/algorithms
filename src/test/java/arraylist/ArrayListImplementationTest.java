package arraylist;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayListImplementationTest {

    @Test
    public void testAddMoreThanDefaultCapacity() {

        ArrayListImplementation<Integer> arrayList = new ArrayListImplementation<>();
        IntStream.rangeClosed(1, 15).forEach(arrayList::add);
        Assert.assertEquals(15, arrayList.size());
    }

    @Test
    public void testSizeOfElementsUsingAdd() {

        ArrayListImplementation<Integer> arrayList = new ArrayListImplementation<>();
        IntStream.rangeClosed(1, 81).forEach(arrayList::add);
        Assert.assertEquals(160, arrayList.lengthOfElements());
    }
}
