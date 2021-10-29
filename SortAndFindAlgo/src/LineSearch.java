public class LineSearch {
    public int search(int[] arr, int findElement)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == findElement) {
                long endTime = System.nanoTime();

                long timeElapsed = endTime - startTime;

                System.out.println("Время выполнения линейного поиска в наносекундах: " + timeElapsed);

                return i;
            }
        }

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Время выполнения линейного поиска в наносекундах: " + timeElapsed);

        return -1;

    }
}
