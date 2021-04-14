package epam.com.java_fundamentals.optional_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class OptionalTask_MatrixWithRandomNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of matrix dimension: ");
        int n = Integer.parseInt(reader.readLine());
        int[][] a = new int[n][n];
        fillMatrixWithRandomNumbers(a);
        streamlineMatrix(a);
        outputMatrix(a);
    }

    private static void fillMatrixWithRandomNumbers(int[][] array) {
        Random random = new Random();
        int borderlineValue = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(borderlineValue) + random.nextInt(borderlineValue) * -1;
            }
        }
    }

    private static void outputMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void streamlineMatrix(int[][] array) {
        int[] array1 = Stream.of(array).flatMapToInt(Arrays::stream).sorted().toArray();
        for (int row = 0; row < array.length; row++) {
            System.arraycopy(array1, row * array.length, array[row], 0, array.length);
        }
    }
}
