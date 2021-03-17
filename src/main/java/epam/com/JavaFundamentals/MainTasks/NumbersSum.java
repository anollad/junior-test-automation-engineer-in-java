package epam.com.JavaFundamentals.MainTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers using space: ");
        String[] arg = reader.readLine().split(" ");
        int[] num = new int[arg.length];

        for (int i = 0; i < arg.length; i++) {
             num[i] = Integer.parseInt(arg[i]);
        }

        int sum = 0;

        for (int j = 0; j < num.length; j++) {
            sum += num[j];
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
