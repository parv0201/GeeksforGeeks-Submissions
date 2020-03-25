package geeksforgeeks.arrays.school;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfElements = scanner.nextInt();
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int j = 0 ; j < numberOfElements ; j++) {
                int number = scanner.nextInt();
                if (number > first) {
                    second = first;
                    first = number;
                } else if (number > second && number != first) {
                    second = number;
                }
            }
            System.out.println(second);
        }
    }
}
