package epam.com.java_collections.optional_tasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Lines {
    public static void main(String[] args) throws IOException {
        String dirName = "target/classes/text";
        String fileName = "STRINGS.txt";
        Path path = FileSystems.getDefault().getPath(dirName, fileName);
        List<String> strings = readAllLines(path, StandardCharsets.UTF_8);
        ArrayList<String> lines = (ArrayList<String>) strings;
        lines.sort(Comparator.comparingInt(String::length));

        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("Strings are sorted by length.");
    }
}