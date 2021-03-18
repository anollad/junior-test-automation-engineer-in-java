package epam.com.JavaCollections.OptionalTasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lines {
    public static void main(String[] args) throws IOException {
        String dirName = "src/main/java/epam/com/JavaCollections/OptionalTasks";
        String fileName = "strings.txt";
        Path path = FileSystems.getDefault().getPath(dirName, fileName);
        List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
        ArrayList<String> lines = (ArrayList<String>) strings;
        lines.sort(Comparator.comparingInt(String::length));

        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("Strings are sorted by length.");
    }
}