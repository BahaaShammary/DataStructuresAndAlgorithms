public class Test {

    public static void main(String[] args){
        int items[] = {7, 8, 5, 4, 9, 2};
        int size = items.length;

        SelectionSort selectionSort = new SelectionSort(items, size);
        int sortedList[] = selectionSort.start();
        System.out.print("[");
        for (int i = 0; i < sortedList.length;i++) {
            System.out.print(sortedList[i] + " ");
        }
        System.out.print("]");
    }
}
