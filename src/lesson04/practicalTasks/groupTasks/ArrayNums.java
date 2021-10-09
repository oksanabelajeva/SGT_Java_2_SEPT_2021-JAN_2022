package lesson04.practicalTasks.groupTasks;

public class ArrayNums {

    public static void main(String[] args) {

        int[] nums = {12, -45};
        int[] numsTwo = {-43, -67, -100, 43653658};
        int[] numsThree = {0, -100, -100, 43653658};
        getLargestNumber(nums, nums.length);
        getLargestNumber(numsTwo, numsTwo.length);
        getLargestNumber(numsThree, numsThree.length);
    }

    public static void getLargestNumber(int[] array, int arraySize) {
        if (arraySize < 3 && arraySize >= 1) {
            int max = array[0];
            int i;

            for (i = 1; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            System.out.printf("The Largest element is %d\n", max);
        } else if (arraySize >= 3) {
            int max;
            for (int i = 0; i < arraySize; i++) {
                for (int j = i + 1; j < arraySize; j++) {
                    if (array[i] > array[j]) {
                        max = array[i];
                        array[i] = array[j];
                        array[j] = max;
                    }
                }
            }
            System.out.printf("The third largest element is %d\n", array[arraySize - 3]);
        }
    }
}