package tech.asmussen;

import java.util.Random;

public class Sorter {

    public int[] generateNumbers(int length) {

        Random random = new Random();

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {

            numbers[i] = random.nextInt(length);
        }

        return numbers;
    }

    public void quickSort(int[] numbers) {

        quickSort(numbers, 0, numbers.length - 1);
    }

    public void quickSort(int[] numbers, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = numbers[pivotIndex];

        quickSwap(numbers, pivotIndex, highIndex);

        int leftPointer = quickPartition(numbers, lowIndex, highIndex, pivot);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);
    }

    private static int quickPartition(int[] array, int lowIndex, int highIndex, int pivot) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {

                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {

                rightPointer--;
            }

            quickSwap(array, leftPointer, rightPointer);
        }

        if(array[leftPointer] > array[highIndex]) {

            quickSwap(array, leftPointer, highIndex);

        } else {

            leftPointer = highIndex;
        }

        return leftPointer;
    }

    private static void quickSwap(int[] numbers, int index1, int index2) {

        int temp = numbers[index1];

        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
