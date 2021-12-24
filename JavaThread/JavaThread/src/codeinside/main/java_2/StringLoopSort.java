package codeinside.main.java_2;

import java.util.Arrays;

public class StringLoopSort implements Runnable{

    private String[] str;

    public StringLoopSort(String[] str){
        this.str = str;
    }


    @Override
    public void run() {

        int size = str.length;

        for (int i = 0; i < size - 1; i++){
            for (int j = i + 1; j < size; j++){
                if (str[i].compareTo(str[j])> 0 ){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Сортировка циклом: " + Arrays.toString(str));
    }


}
