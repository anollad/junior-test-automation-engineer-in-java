package epam.com.JavaFundamentals.OptionalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class OptionalTask2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] a = new int[n][n];
        fillMatrixWithRandomNumbers(a);
        streamlineMatrix(a);
        outputMatrix(a);
    }

    private static void fillMatrixWithRandomNumbers(int[][] array) {
        Random random = new Random();
        int m = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(m) + random.nextInt(m)*-1;
            }
        }
    }

    private static void outputMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void streamlineMatrix(int[][] array) {
        int[] array1 = Stream.of(array).flatMapToInt(Arrays::stream).sorted().toArray();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                array[row][col] = array1[row * array.length + col];
            }
        }
    }
}
