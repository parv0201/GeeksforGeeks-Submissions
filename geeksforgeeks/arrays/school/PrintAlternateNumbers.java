package geeksforgeeks.arrays.school;

import java.util.*;

class PrintAlternateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG.print(arr, n);
            System.out.println();
        }
    }
}

class GfG {
    public static void print(int[] arr, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
            j++;
        }
    }
}