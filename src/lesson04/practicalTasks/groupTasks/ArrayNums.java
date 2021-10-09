package lesson04.practicalTasks.groupTasks;

public class ArrayNums {

    public static void main(String[] args) {

        int[] nums = {12, -45};
        int[] numsTwo = {-43, -67, -100, 43653658};
        thirdLargest(nums, nums.length);
        thirdLargest(numsTwo, numsTwo.length);
    }

    static void thirdLargest(int array[], int arraySize) {
        if (arraySize < 3 && arraySize >=1) {
            int max = array[0];
            int i;

            for (i = 1; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            System.out.printf("The Largest element is %d\n", max);
        } else if (arraySize >= 3) {

            int maxFirst = array[0];
            for (int i = 1; i < arraySize; i++) {
                if (array[i] > maxFirst)
                    maxFirst = array[i];
            }

            int maxSecond = Integer.MIN_VALUE;
            for (int i = 0; i < arraySize; i++) {
                if (array[i] > maxSecond && array[i] < maxFirst)
                    maxSecond = array[i];
            }

            int maxThird = Integer.MIN_VALUE;
            for (int i = 0; i < arraySize; i++) {
                if (array[i] > maxThird && array[i] < maxSecond)
                    maxThird = array[i];
            }
            System.out.printf("The third Largest element is %d\n", maxThird);
        }
    }
}