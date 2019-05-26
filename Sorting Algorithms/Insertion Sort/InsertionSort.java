import java.util.ArrayList;

/**
 * Sorting in this example means all items to the left of an item, are smaller than that item.
 * This algorithm chooses a key (item from the list) and compares it to all previous items, if the key
 * is smaller than an item before it, it swaps it and so on.
 */
public class InsertionSort {
    int list[];
    int size;

    public InsertionSort(int[] aList, int length) {
        list = aList;
        size = length;
    }
    public int[] start() {
        for (int i = 1; i < size;i++) { // start at 1 because the first item does not need to sort itself
            int key = list[i];
            for (int j = i-1; j >= 0;j--) { // start at j = i-1 so we don't compare item to itself
                int temp = list[j];
                if (key < temp) {
                    list[i] = temp; // move the item bigger than the key in the place of the key
                    list[j] = key; // move the key to the place of the previously moved items
                    i--; // this is because the key is now in a new index - a previous order index
                }
            }
        }
        return list;
    }
 }
