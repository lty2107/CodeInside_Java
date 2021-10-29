import java.time.Instant;

public class BinarySearch {
    public int search(int[] sortedArray, int key, int low, int high) {

        long startTime = System.nanoTime();
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Время выполнения бинарного поиска в наносекундах: " + timeElapsed);
        return index;
    }
}
