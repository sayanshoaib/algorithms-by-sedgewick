package fundamentals.basic_programming_model;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1, 6, 3, 5, 9, 8};
        var res = findMaxValue(a);
        System.out.println("The maximum of the array values: " + res);

        res = calculateAvgValue(a);
        System.out.println("The average of the array values: " + res);

        var copy = copyToAnotherArray(a);
        System.out.println("New array from copy of a: " + Arrays.toString(copy));

        reverseTheArray(a);
        System.out.println("Reversed array: " + Arrays.toString(a));

        int[][] arr1 = {
                {1, 2, 3},
                {2, 3, 4}
        };

        int[][] arr2 = {
                {4, 5, 6},
                {7, 8, 9}
        };

        var squareMatrices = matrixMultiplication(arr1, arr2);
        System.out.println(Arrays.toString(squareMatrices));
    }

    public static int findMaxValue(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        return max;
    }

    public static int calculateAvgValue(int[] a) {
        int N = a.length;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int average = sum / N;
        return average;
    }

    public static int[] copyToAnotherArray(int[] a) {
        int N = a.length;
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }

        return b;
    }

    public static void reverseTheArray(int[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            var temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - i - 1] = temp;
        }
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int N = a.length;
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[i][k];
                }
            }
        }

        return c;
    }
}
