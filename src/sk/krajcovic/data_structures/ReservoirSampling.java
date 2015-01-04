package sk.krajcovic.data_structures;

import java.util.Random;

public class ReservoirSampling {

    public static int[] sample(int[] array, int sampleSize) {
        int[] reservoir = new int[sampleSize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            if (i < sampleSize) {
                reservoir[i] = array[i];
            } else {
                int reservoirIndex = random.nextInt(i + 1);
                if (reservoirIndex < sampleSize) {
                    reservoir[reservoirIndex] = array[i];
                }
            }
        }

        return reservoir;
    }

}
