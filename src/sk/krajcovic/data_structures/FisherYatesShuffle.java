package sk.krajcovic.data_structures;

import java.util.Random;

public class FisherYatesShuffle {

    public static int[] shuffle(int[] inputArray) {
        Random random = new Random();
        for (int i = (inputArray.length - 1); i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);

            int temp = inputArray[randomIndex];
            inputArray[randomIndex] = inputArray[i];
            inputArray[i] = temp;
        }

        return inputArray;
    }

}
