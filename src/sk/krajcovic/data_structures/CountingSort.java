package sk.krajcovic.data_structures;

public class CountingSort {

    public static int[] sort(int[] inputArray) {
        int maxValue = 0;
        for (int value : inputArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        maxValue++;

        int[] counts = new int[maxValue];

        for (int i = 0; i < maxValue; i++) {
            counts[i] = 0;
        }

        for (int value : inputArray) {
            counts[value] += 1;
        }

        int total = 0;
        for (int i = 0; i < maxValue; i++) {
            int originalValue = counts[i];
            counts[i] = total;
            total += originalValue;
        }

        int[] outputArray = new int[inputArray.length];

        for (int value : inputArray) {
            outputArray[counts[value]] = value;
            counts[value]++;
        }

        return outputArray;
    }

}
