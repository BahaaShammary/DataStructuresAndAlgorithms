/**
 * The way Bubble Sort works is that it repeatedly compares adjacent items in the list (in pairs) until
 * the larger items are all on the right and all items are sorted
 * Whenever it finds an item on the left larger than the one right to it, it swaps them
 *
 */
public class BubbleSort {
    int list[];
    int size;

    public BubbleSort(int[] aList, int length) {
        list = aList;
        size = length;
    }
    public int[] start() {
        for (int i = 0; i<size;i++) {
            for (int j = 1; j < size-i; j++) { // Starting from 1 and comparing to previous item always
                int temp = list[j-1]; // temp is the previous item
                if (temp > list[j]) { // if previous item is bigger than the current one we're on, then swap
                    list[j-1] = list[j]; // the index of temp is used to swap
                    list[j] = temp; // give the current index the value of temp to complete swap
                }
            }
        }
        return list;
    }
 }
