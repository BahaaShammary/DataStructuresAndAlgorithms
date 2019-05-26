/**
 * This sorting algorithm searches through the list to find the smallest item in the unsorted part of
 * the list then moves it to the first position of the list. Then moves to the next item and compares
 * it to the rest of the list and see the next smallest value and swap it.
 */
public class SelectionSort {
    int list[];
    int size;

    public SelectionSort(int[] aList, int length) {
        list = aList;
        size = length;
    }
    public int[] start() {
        int min = 0; // intitialise variables
        int minIndex;
        int temp;
        for (int i = 0; i<size;i++) {
            min = list[i]; // set the next item to be min
            temp = list[i]; // this stores the number to be replaced (for swapping)
            minIndex = i; // set index to i
            for (int j = i+1; j < size; j++) { // start from i+1, the next item to avoid comparing to itself
                if (list[j] < min) {
                    min = list[j]; // set the new minimum to the number that is smaller than the current min
                    minIndex = j; // store the index of this minimum
                }
            }
            if (min < list[i]) { // only do the swapping if there is a smaller value than our current chosen value
                list[i] = min; // move the min to its appropriate location and swap it
                list[minIndex] = temp; // Move the item to the place where the min used to be
            }
        }
        return list;
    }
 }
