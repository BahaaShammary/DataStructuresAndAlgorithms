# Bubble Sort

List = [5, 8, 1, 6, 9, 2]
> The way Bubble Sort works is that it repeatedly compares adjacent items in the list (sorting in pairs). Whenever it finds an item on the left larger than the one to its right, it swaps them. 
> This way the larger items all bubble to the right. 
> In each iteration of the loop there is one item that gets sorted, so basically looping for as long as the length of the list ensures all items are sorted. 
> Seeing the above list as an example, the algorithm in its first iteration, checks 5 and 8, is 5 > 8? No, then leave them alone. 
> Next, compares 8 and 1, is 8 > 1? Yes, then swap them, next, compare 8 and 6, is 8 > 6? Yes, then swap, next, compare 8 and 9, is 8 > 9?   No, then leave them alone. Next, compare 9 and 2, is 9 > 2? Yes, then swap them. 
> After the first iteration our list looks like this: List = [5, 1, 6, 8, 2, 9]
> The algorithm repeats this process until all large items are on the right and the smaller ones are on the left sorting the list in an increasing order. 
> This algorithm is not fast or efficient because it uses nested loops
> It is good for small data sets.
Complexity: 
O(n^2) – This is because it loops through the list for each item.  
