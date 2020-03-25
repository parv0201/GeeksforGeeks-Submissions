package geeksforgeeks.arrays.school;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int sum = 0;
            int sizeOfArray = scanner.nextInt();
            for (int j = 0; j < sizeOfArray; j++) {
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        }
    }
}
