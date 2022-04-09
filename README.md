# Sorters
Different sorting algorithms in Java 17.

### You are welcome to fork this project and add your own alorgithm implementations!

# Usage:
```java
Sorter sorter = new Sorter();

sorter.quickSort(yourArray); // Use the quickSort method to sort your array.
sorter.mergeSort(yourArray); // Use the mergeSort method to sort your array.
sorter.insertionSort(yourArray); // Use the insertionSort method to sort your array.
sorter.bubbleSort(yourArray); // Use the bubbleSort method to sort your array.
sorter.bogoSort(Arrays.stream(yourArray).boxed().collect(Collectors.toList())); // Use the bogoSort method to sort your array.

int value = sorter.binarySearch(yourArray, target); // Use the binarySearch to search through a sorted array and find a target number. 

int largest = sorter.getLargest(yourArray); // Use the getLargest method to get the largest element in the array.
int smallest = sorter.getSmallest(yourArray); // Use the getSmallest method to get the smallest element in the array.
int median = sorter.getMedian(yourArray); // Use the getMedian method to get the median of the array.

double average = sorter.getAverage(yourArray); // Use the getAverage method to get the average value of the array.
```
