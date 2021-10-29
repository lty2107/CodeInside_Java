import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Runner {

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        LineSearch lineSearch = new LineSearch();
        BinarySearch binarySearch = new BinarySearch();

        int n, k;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Заполняем массив случайными числами для сортировки пузырьком");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort.sort(arr);
        bubbleSort.reverseSort(arr);

        System.out.println("Заполняем массив случайными числами для сортировки выбором");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        selectionSort.sort(arr);
        selectionSort.reverseSort(arr);

        System.out.println("Заполняем массив случайными числами для сортировки вставкой");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        insertSort.sort(arr);
        insertSort.reverseSort(arr);

        System.out.println("Заполняем массив случайными числами для быстрой сортировки");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        long startTime = System.nanoTime();
        quickSort.sort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения быстрой сортировки в наносекундах: " + timeElapsed);
        quickSort.printArr(arr);
        startTime = System.nanoTime();
        quickSort.reverseSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Время выполнения обратной быстрой сортировки в наносекундах: " + timeElapsed);
        quickSort.printArr(arr);

        System.out.println("Сортируем массив снова в порядке возрастания");
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println("Введите число для поиска");
        quickSort.printArr(arr);
        k = in.nextInt();
        System.out.println(lineSearch.search(arr, k));
        System.out.println(binarySearch.search(arr, k, 0, arr.length - 1));
    }
}
