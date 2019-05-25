import java.util.ArrayList;

public class Test {

    public static void main(String[] args){
        int items[] = {5, 8, 1, 3, 9, 6};
        int size = items.length;

        InsertionSort insertionSort = new InsertionSort(items, size);
        int sortedList[] = insertionSort.start();
        System.out.print("[");
        for (int i = 0; i < sortedList.length;i++) {
            System.out.print(sortedList[i] + " ");
        }
        System.out.print("]");
    }
}
