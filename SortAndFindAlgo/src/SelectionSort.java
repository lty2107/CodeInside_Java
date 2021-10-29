import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr){
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < minVal){
                    minVal = arr[j];
                    minIndex = j;
                }

            }

            if (i != minVal){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Время выполнения сортировки выбором в наносекундах: " + timeElapsed);
        System.out.println(Arrays.toString(arr));
    }
    public void reverseSort(int[] arr){
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int maxVal = arr[i];
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > maxVal){
                    maxVal = arr[j];
                    maxIndex = j;
                }

            }

            if (i != maxIndex){
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Время выполнения обратной сортировки выбором в наносекундах: " + timeElapsed);
        System.out.println(Arrays.toString(arr) + "\n");
    }
}
