package epam.com.JavaFundamentals.MainTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arg = reader.readLine();

        for (int i = arg.toCharArray().length-1; i >= 0; i--) {
            System.out.print(arg.toCharArray()[i]);
        }
    }
}

