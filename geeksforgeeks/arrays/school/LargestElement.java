package geeksforgeeks.arrays.school;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfElements = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            for (int j = 0 ; j < numberOfElements ; j++) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
            }
            System.out.println(max);
        }
    }
}
