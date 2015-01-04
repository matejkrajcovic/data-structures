package sk.krajcovic.data_structures;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReservoirSamplingTest {

    @Test
    public void testSample() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sampleSize = 3;

        int[] sample = ReservoirSampling.sample(array, sampleSize);

        Assert.assertTrue(sample.length == sampleSize);

        for (int value : sample) {
            Assert.assertTrue(Arrays.binarySearch(array, value) >= 0);
        }
    }
}