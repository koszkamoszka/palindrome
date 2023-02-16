package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = scanner.nextLine();

        while (!str.isEmpty()) {
            list.add(str);
            str = scanner.nextLine();
        }

        for (String line : list) {
            if (isPalindrome2(line)) {
                System.out.println(line);
            }
        }
    }

    private static boolean isPalindrome(String line) {
        String reverseStr = "";
        for (int k = line.length() - 1; k >= 0; k--) {
            reverseStr = reverseStr + line.charAt(k);
        }
        return reverseStr.equals(line);
    }

    private static boolean isPalindrome2(String line) {
        for (int i = 0; i <= 0.5 * line.length(); i++) {
            if (line.charAt(i) != line.charAt(line.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    private static int method(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }
}

/*
log(n) = 16 ms = 0.016 s
sqrt(n) = 316 ms = 0.316 s
n / 2 = 50 000 ms = 50 s
n = 100 000 ms = 100 s
n * log(n) = 1 600 000 ms = 1600 s
n ^ 2 = 10 000 000 000 ms = 10 000 000 s
n ^ 3 = 10^15 ms = 10^12 s
n! = ...
 */
