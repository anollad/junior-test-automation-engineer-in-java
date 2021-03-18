package epam.com.JavaCollections.OptionalTasks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) throws IOException {
            String dirName = "src/main/java/epam/com/JavaCollections/OptionalTasks";
            String fileName = "strings.txt";
            Path path = FileSystems.getDefault().getPath(dirName, fileName);
                List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);

        try(FileWriter fw = new FileWriter("src/main/java/epam/com/JavaCollections/OptionalTasks/strings.txt", false)){
            for (int i = strings.size()-1; i >= 0; i--) {
                fw.write(strings.get(i)+ "\n");
                fw.flush();
            }
        }
        catch (IOException e){
        }
        System.out.println("String were reverted. See 'strings.txt'");
    }
}
