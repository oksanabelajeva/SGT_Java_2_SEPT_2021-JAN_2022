package lessons.lesson04.practicalGroupTasks;

import java.util.Set;
import java.util.TreeSet;

public class ArraysNumsByHelena {
    public static void main(String[] args) {
        int numArray[] = {1,6,88,22,4,9,0,5,12,34,6,79,4,6,34,7,79};
        Set<Integer> numSet = new TreeSet<>();
        // Converting the array into the TreeSet, which is sorted and doesn't have duplicates
        for (Integer num : numArray) {
            numSet.add(num);
        }
        int n = numSet.size();
        Integer arr[] = new Integer[n];
        // Converting the set back to an array, so we can access elements by its index
        arr = numSet.toArray(arr);
        // Getting the third max number if there is such
        if (arr.length >= 3) {
            System.out.println(arr[arr.length-3]);
            // Getting the max number if the array size is smaller than 3
        } else {
            System.out.println(arr[arr.length-1]);
        }
    }
}