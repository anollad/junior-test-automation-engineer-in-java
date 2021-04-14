package epam.com.java_fundamentals.main_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text for revert: ");
        String arg = reader.readLine();
        System.out.println("Reverted text: ");

        for (int i = arg.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(arg.toCharArray()[i]);
        }
    }
}

