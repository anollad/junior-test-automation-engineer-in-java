package epam.com.java_fundamentals.main_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserName {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");

        String username = reader.readLine();

        System.out.println("Hello, " + username);
    }
}
