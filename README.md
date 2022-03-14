# Sorter
Different sorting algorithms in Java 17.

**You are welcome to fork this project and add your own alorgithm implementations!**

# Usage:
```java
Sorter sorter = new Sorter();

int[] numbers = sorter.generateNumbers(100); // Generate a random integer array of size n.
List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList()); // Use the randomly generated array converted to a list to be used in the bogoSort() method.

sorter.quickSort(numbers); // Use the quicksort algorithm to sort your array.
sorter.mergeSort(numbers); // Use the mergesort algorithm to sort your array.
sorter.insertionSort(numbers); // Use the insertionsort algorithm to sort your array.
sorter.bubbleSort(numbers); // Use the bubblesort algorithm to sort your array.
sorter.bogoSort(numberList); // Use the bogosort algorithm to sort your array.
int largest = sorter.getLargest(numbers); // Use the get largest algorthm to get the largest element in the array.
```
