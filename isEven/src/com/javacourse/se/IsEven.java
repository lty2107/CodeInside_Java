package com.javacourse.se;

    public class IsEven {

        public static boolean isEven(int n){
            boolean x = n % 2 == 1 ? true : false;
            return  x;
        }

        public static void main(String args[])
        {
            System.out.println(isEven(6));

        }
}
