package com.javacourse.se.laba4;

import java.util.Scanner;

public class Factorial {

    public static int calculateFactorialByLoop(int num){
        int x = 1;
        for (int i = 1; i <= num; i++){
            x *= i;
        }
        return x;
    }

    public static int calculateFactorialByRecursion(int num){
        int result = 1;
        if (num == 0 || num == 1){
            return result;
        }
        result = num * calculateFactorialByRecursion(num - 1);
        return result;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num < 0){
            System.out.println("Фактриал рассчитывается только для положительных чисел");
        }
        else if (num == 0){
            System.out.println(1);
        }
        else{
            System.out.println("Факториал циклом: " + calculateFactorialByLoop(num));
            System.out.println("Факториал рекурсией: " + calculateFactorialByRecursion(num));
        }
    }
}
