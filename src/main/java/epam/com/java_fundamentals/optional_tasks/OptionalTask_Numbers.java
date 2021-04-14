package epam.com.java_fundamentals.optional_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class OptionalTask_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter count of numbers: ");
        int n = Integer.parseInt(reader.readLine());
        String[] num = new String[n];
        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            num[i] = reader.readLine();
        }

        int min = num[0].length(), max = num[0].length();
        String minStr = num[0], maxStr = num[0];
        for (String numbers : num) {
            if (numbers.length() < min) {
                min = numbers.length();
                minStr = numbers;
            }
            if (numbers.length() > max) {
                max = numbers.length();
                maxStr = numbers;
            }
        }

        int countLength = 0;
        for (int i = 0; i < num.length - 1; i++) {
            countLength += num[i].length();
        }
        int middleLength = countLength / n;
        for (String number : num) {
            if (number.length() < middleLength) {
                System.out.println("Length less than middle length: " + number + " with length: " + number.length());
            }
        }

        System.out.println();
        for (int i = 0; i < num.length - 1; i++) {
            Comparator<String> comparator = Comparator.comparingInt(String::length);
            Arrays.sort(num, comparator);
        }
        System.out.println("Numbers from the shortest to the longest:");
        for (String numbers : num) {
            System.out.println(numbers);
        }

        System.out.println();
        System.out.println("The shortest number " + minStr + " consists of " + min
                + " numerals\nThe longest number " + maxStr + " consists of " + max
                + " numerals");
    }
}
