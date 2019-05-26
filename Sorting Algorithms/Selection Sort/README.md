# Selection Sort

This sorting algorithm searches through the list to find the smallest item in the unsorted part of the list then moves it to the first position of the list. Then moves to the next item and compares it to the rest of the list and see the next smallest value and swap it.
List = [7, 8, 5, 4, 9, 2]
In the first iteration, will start with 7 and set it to the ‘min value’. Then compare it to other values in the list, so move to 8, is 8 smaller than min value? No. Move to the next item which is 5. Is 5 smaller than min value? Yes. Now, set the min value to be 5. Keep doing this until we reach last item in the list which happens to be 2, the smallest item in the list. Since 2 is the smallest item, we swap it with 7 so from our first iteration our list is: 
List = [2, 8, 5, 4, 9, 7]
Now, 2 is sorted and therefore we start with the next item in the list and compare it to the rest until the whole list is sorted.
This sorting algorithm is not a fast one because it uses nested loops to sort. Is useful for small data sets.

Complexity: 
O(n^2) – This is because for each item in the list, it runs and checks all items in the list.
