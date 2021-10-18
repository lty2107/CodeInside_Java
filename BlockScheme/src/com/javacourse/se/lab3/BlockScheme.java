package com.javacourse.se.lab3;

public class BlockScheme {

    public static void main(String args[])
    {
        int a = 3, b = 4, c;

        if (b > 0){
            c = 1;
            for (int i = 0; i <= b; i++){
                c *= a;
            }
        }
        else if (b == 0){
            c = 1;
        }
        else{
            c = 1;
            for (int i = 0; i <= Math.abs(b); i++){
                c *= a;
            }
            c = 1 / c;
        }

        System.out.println(c);
    }
}
