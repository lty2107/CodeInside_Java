package com.javacourse.se.lab2;

public class LevensteinDistance {

    static int calculate(String str1, String str2) {

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        // Если первая строка пустая
        // мы выполняем для неё операции вставки
        // из встроки
        // будет j операций

        if (str1.isEmpty()) {
            return str2.length();
        }

        // Аналогично для второй строки
        // Будет i операций

        if (str2.isEmpty()) {
            return str1.length();
        }

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                // заполняем матрицу нулями
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        for( int i = 1; i < str1.length() + 1; i++ ) {
            for( int j = 1; j < str2.length() + 1; j++ ) {
                int d1 = dp[ i - 1 ][ j ] + 1; //удаление
                int d2 = dp[ i ][ j - 1 ] + 1; //вставка
                int d3 = dp[ i - 1 ][ j - 1 ]; //замена
                if ( s1[ i - 1 ] != s2[ j - 1 ] ) {
                    d3 += 1;
                }
                dp[ i ][ j ] = Math.min( Math.min( d1, d2 ), d3 );
            }
        }

        return dp[str1.length()][str2.length()];
    }

    public static void main(String args[])
    {
        String s1 = "easy";
        String s2 = "peasy";

        System.out.println(calculate(s1, s2));
    }
}
