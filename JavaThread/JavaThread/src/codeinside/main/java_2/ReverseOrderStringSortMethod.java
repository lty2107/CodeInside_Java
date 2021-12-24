package codeinside.main.java_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrderStringSortMethod implements Runnable{

    private String[] str;

    public ReverseOrderStringSortMethod(String[] str){
        this.str = str;
    }

    @Override
    public void run() {

        Arrays.sort(str, Collections.reverseOrder());

        System.out.println("Метод для обратной сортировки: " + Arrays.toString(str));
    }
}
