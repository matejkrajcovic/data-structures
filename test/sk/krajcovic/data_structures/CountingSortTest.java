package sk.krajcovic.data_structures;

import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void testSort() throws Exception {
        int[] unsorted = {1, 4, 0, 3, 6, 2};
        int[] sorted   = {0, 1, 2, 3, 4, 6};

        CountingSort countingSort = new CountingSort();
        int[] countingSorted = countingSort.sort(unsorted);

        Assert.assertArrayEquals(sorted, countingSorted);
    }

}