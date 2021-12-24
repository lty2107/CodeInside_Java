package codeinside.main.java_2;

import java.util.Arrays;

public class StringSortMethod implements Runnable{

   private String[] str;

   public StringSortMethod(String[] str){
       this.str = str;
   }

    @Override
    public void run() {

        Arrays.sort(str);

        System.out.println("Метод для сортировки: " + Arrays.toString(str));

    }
}
