import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array, int low, int high) {
        {
            int middle = low + (high - low) / 2;
            int pivot = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (array[i] < pivot) {
                    i++;
                }

                while (array[j] > pivot) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                sort(array, low, j);

            if (high > i)
                sort(array, i, high);
        }

    }
    public static void reverseSort(int[] array, int low, int high) {
        {
            int middle = low + (high - low) / 2;
            int pivot = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (array[i] > pivot) {
                    i++;
                }

                while (array[j] < pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j)
                reverseSort(array, low, j);

            if (high > i)
                reverseSort(array, i, high);
        }
    }
    public void printArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}

