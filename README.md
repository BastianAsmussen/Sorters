# Sorters
Different sorting algorithms in Java 17.

### You are welcome to fork this project and add your own alorgithm implementations!

# Usage:
```java
Sorter sorter = new Sorter();

sorter.quickSort(yourArray); // Use the quicksort algorithm to sort your array.
sorter.mergeSort(yourArray); // Use the mergesort algorithm to sort your array.
sorter.insertionSort(yourArray); // Use the insertionsort algorithm to sort your array.
sorter.bubbleSort(yourArray); // Use the bubblesort algorithm to sort your array.
sorter.bogoSort(Arrays.stream(numbers).boxed().collect(Collectors.toList())); // Use the bogosort algorithm to sort your array.

int largest = sorter.getLargest(numbers); // Use the get largest algorthm to get the largest element in the array.
```
