public class Test {

    public static void main(String[] args){
        int items[] = {5, 8, 1, 6, 9, 2};
        int size = items.length;

        BubbleSort bubbleSort = new BubbleSort(items, size);
        int sortedList[] = bubbleSort.start();
        System.out.print("[");
        for (int i = 0; i < sortedList.length;i++) {
            System.out.print(sortedList[i] + " ");
        }
        System.out.print("]");
    }
}
