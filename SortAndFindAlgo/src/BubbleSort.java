import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr){
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения сортировки пузырьком в наносекундах: " + timeElapsed);
        System.out.println(Arrays.toString(arr));
    }
    public void reverseSort(int[] arr){
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++){
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения обратной сортировки пузырьком в наносекундах: " + timeElapsed);
        System.out.println(Arrays.toString(arr) + "\n");
    }

}
