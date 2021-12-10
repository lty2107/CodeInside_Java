package codeinside.main.java_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainSort {
    private static String[] stringArray = new String[] {
            "абвгд",
            "Первый",
            "Второй",
            "asd",
            "qwe",
            "first",
            "привет",
            "строка",
    };

    public static void main(String[] args) {
        StringLoopSort stringLoopSort = new StringLoopSort(stringArray);
        StringSortMethod stringSortMethod = new StringSortMethod(stringArray);
        ReverseOrderStringSortMethod reverseOrderStringSortMethod = new ReverseOrderStringSortMethod(stringArray);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(stringLoopSort);
        executorService.submit(stringSortMethod);
        executorService.submit(reverseOrderStringSortMethod);

        executorService.shutdown();
    }

}
