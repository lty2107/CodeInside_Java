package src.com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string_test = in.nextLine();
        System.out.println("Длина строки: " + string_test.length());
        System.out.println("Знаки пунктуации:" + checkPunctuationCharacter(string_test));
        System.out.println("Палиндром:" + isPalindrome(string_test));
        System.out.println(Arrays.toString(splitString(string_test)));

    }

    private static boolean checkPunctuationCharacter(String string_test){
        return string_test.matches("(.*)\\p{Punct}(.*)");
    }

    private static boolean isPalindrome(String string_test){
        int i = 0, j = string_test.length() - 1;
        while (i < j){
            if (string_test.charAt(i) != string_test.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static String[] splitString(String string_test){
        String[] new_string_test = string_test.split("\\w+[\\!\\,\\;\\.\\s]\\w+");
        return new_string_test;
    }

}
