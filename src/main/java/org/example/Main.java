package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Projects\\Java\\palindrome\\src\\main\\resources\\input.txt";
        String outputFilePath = "C:\\Projects\\Java\\palindrome\\src\\main\\resources\\output.txt";
        Scanner scanner = new Scanner(new File(inputFilePath));
        ArrayList<String> list = new ArrayList<>();
        String str;

        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            list.add(str);
        }

        Path outputFile = Path.of(outputFilePath);
        Files.createFile(outputFile);
        for (String line : list) {
            if (isPalindrome2(line)) {
                Files.writeString(outputFile, line + "\n", StandardOpenOption.APPEND);
            }
        }
        scanner.close();
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

//    public void whenReadSmallFileJava7_thenCorrect()
//            throws IOException {
//        String expected_value = "Hello, world!";
//
//        Path path = Paths.get("src/test/resources/fileTest.txt");
//
//        String read = Files.readAllLines(path).get(0);
//        assertEquals(expected_value, read);
//    }

//    private static int method(int n) {
//        int[][] array = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = i + j;
//            }
//        }
//    }
}

/*
1 = const = nice
log(n) = 16 ms = 0.016 s
sqrt(n) = 316 ms = 0.316 s
n / 2 = 50 000 ms = 50 s
n = 100 000 ms = 100 s
n * log(n) = 1 600 000 ms = 1600 s
n ^ 2 = 10 000 000 000 ms = 10 000 000 s
n ^ 3 = 10^15 ms = 10^12 s
n! = ...
 */
