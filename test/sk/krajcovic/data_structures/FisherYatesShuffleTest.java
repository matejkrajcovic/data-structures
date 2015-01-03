package sk.krajcovic.data_structures;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FisherYatesShuffleTest {

    @Test
    public void testShuffle() throws Exception {
        int[] array = {1, 2, 3, 4, 5};
        int[] original = array.clone();

        FisherYatesShuffle fisherYatesShuffle = new FisherYatesShuffle();
        array = fisherYatesShuffle.shuffle(array);

        Assert.assertEquals(original.length, array.length);

        for (int value : array) {
            Assert.assertTrue(Arrays.binarySearch(original, value) >= 0);
        }
    }
}