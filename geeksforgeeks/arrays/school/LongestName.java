package geeksforgeeks.arrays.school;

import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfNames = scanner.nextInt();
            String[] names = new String[numberOfNames];
            int indexWithLongestString = 0;
            for (int j = 0 ; j < numberOfNames ; j++) {
                names[j] = scanner.next();
                if (names[j].length() > names[indexWithLongestString].length()) {
                    indexWithLongestString = j;
                }
            }
            System.out.println(names[indexWithLongestString]);
        }
    }
}
