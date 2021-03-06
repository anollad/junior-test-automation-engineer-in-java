package epam.com.java_collections.optional_tasks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class Poem {
    public static void main(String[] args) throws IOException {
        String dirName = "target/classes/text";
        String fileName = "POEM.txt";
        Path path = FileSystems.getDefault().getPath(dirName, fileName);
        List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
        strings.sort(Comparator.comparingInt(String::length));

        for (String lines : strings) {
            System.out.println(lines);
        }
        System.out.println();
        System.out.println("Strings of poem are sorted by length.");
    }
}
