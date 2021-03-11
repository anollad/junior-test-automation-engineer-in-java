package epam.com.JavaFundamentals.MainTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter count of random numbers: ");

        int rand = Integer.parseInt(reader.readLine());
        int[] num = new int[rand];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.print(num[i] + " ");
        }
    }
}
