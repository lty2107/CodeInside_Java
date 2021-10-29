import java.util.Arrays;

public class InsertSort {
    public void sort(int[] arr){
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int temp = arr[i];

            while (index > 0 && arr[index - 1] >= temp){
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения сортировки вставками в наносекундах: " + timeElapsed);

        System.out.println(Arrays.toString(arr));
    }
    public void reverseSort(int[] arr){
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int temp = arr[i];

            while (index > 0 && arr[index - 1] <= temp){
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения обратной сортировки вставками в наносекундах: " + timeElapsed);
        System.out.println(Arrays.toString(arr) + "\n");
    }
}
