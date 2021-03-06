package tech.asmussen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorter {

    // START OF QUICK SORT
    public void quickSort(int[] numbers) {

        quickSort(numbers, 0, numbers.length - 1);
    }

    private void quickSort(int[] numbers, int lowIndex, int highIndex) {

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

        if (array[leftPointer] > array[highIndex]) {

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
    // END OF QUICK SORT

    // START OF MERGE SORT
    public void mergeSort(int[] numbers) {

        int length = numbers.length;

        if (length < 2) return;

        int middleIndex = length / 2;

        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[length - middleIndex];

        System.arraycopy(numbers, 0, leftHalf, 0, middleIndex);

        if (length - middleIndex >= 0) System.arraycopy(numbers, middleIndex, rightHalf, 0, length - middleIndex);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge halves
        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {

        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {

            if (leftHalf[i] <= rightHalf[j]) {

                numbers[k] = leftHalf[i];

                i++;

            } else {

                numbers[k] = rightHalf[j];

                j++;
            }

            k++;
        }

        while (i < leftLength) {

            numbers[k] = leftHalf[i];

            i++;
            k++;
        }

        while (j < rightLength) {

            numbers[k] = rightHalf[j];

            j++;
            k++;
        }
    }
    // END OF MERGE SORT

    // START OF INSERTION SORT
    public void insertionSort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {

            int currentValue = numbers[i];

            int j = i - 1;

            while (j >= 0 && numbers[j] > currentValue) {

                numbers[j + 1] = numbers[j];

                j--;
            }

            numbers[j + 1] = currentValue;
        }
    }
    // END OF INSERTION SORT

    // START OF BUBBLE SORT
    public void bubbleSort(int[] numbers) {

        boolean hasSwapped;

        do {

            hasSwapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {

                    hasSwapped = true;

                    int temp = numbers[i];

                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }

        } while (hasSwapped);
    }
    // END OF BUBBLE SORT

    // START OF BOGO SORT
    public void bogoSort(List<Integer> numbers) {

        while (!isBogoSorted(numbers)) {

            Collections.shuffle(numbers);
        }
    }

    private static boolean isBogoSorted(List<Integer> numbers) {

        if (numbers == null) return true;

        int length = numbers.size();

        if (length <= 1) return true;

        for (int i = 0; i < length - 1; i++) {

            if (numbers.get(i) > numbers.get(i + 1)) return false;
        }

        return true;
    }
    // END OF BOGO SORT

    // START OF BINARY SEARCH
    public int binarySearch(int[] numbers, int target) {

        return Arrays.binarySearch(numbers, target);
    }
    // END OF BINARY SEARCH

    // START OF GET LARGEST
    public int getLargest(int[] numbers) {

        return Arrays.stream(numbers).max().isPresent() ? Arrays.stream(numbers).max().getAsInt() : 0;
    }
    // END OF GET LARGEST

    // START OF GET SMALLEST
    public int getSmallest(int[] numbers) {

        return Arrays.stream(numbers).min().isPresent() ? Arrays.stream(numbers).min().getAsInt() : 0;
    }
    // END OF GET SMALLEST

    // START OF GET MEDIAN
    public int getMedian(int[] numbers) {

        return Arrays.stream(numbers).sorted().skip(numbers.length / 2).findFirst().isPresent() ? Arrays.stream(numbers).sorted().skip(numbers.length / 2).findFirst().getAsInt() : 0;
    }
    // END OF GET MEDIAN

    // START OF GET AVERAGE
    public double getAverage(int[] numbers) {

        return Arrays.stream(numbers).average().isPresent() ? Arrays.stream(numbers).average().getAsDouble() : 0;
    }
    // END OF GET AVERAGE
}
