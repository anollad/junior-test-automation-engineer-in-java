package epam.com.java_fundamentals.optional_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter count of numbers: ");
        int n = Integer.parseInt(reader.readLine());
        String[] num = new String[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = reader.readLine();
        }
        int min = num[0].length();
        int max = num[0].length();
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

        for (int i = 0; i < num.length - 1; i++) {
            int a = (num[i].length() + num[i + 1].length()) / num.length;
            if (num[i].length() < a) {
                System.out.println("Length less than middle length: " + num[i] + " with length: " + num[i].length());
            }
        }

        System.out.println();
        for (String str : num) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("The shortest number " + minStr + " consists of " + min
                + " numerals\nThe longest number " + maxStr + " consists of " + max
                + " numerals");
        System.out.println();
    }
}
