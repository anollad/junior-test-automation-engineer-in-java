package epam.com.java_collections.optional_tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) throws IOException {
            String dirName = "target/classes/text";
            String fileName = "STRINGS.txt";
            Path path = FileSystems.getDefault().getPath(dirName, fileName);
            List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);

            try(FileWriter fw = new FileWriter("target/classes/text/STRINGS.txt", false)){
                for (int i = strings.size()-1; i >= 0; i--) {
                    fw.write(strings.get(i)+ "\n");
                    fw.flush();
                }
        }
        catch (IOException e){
        }
        System.out.println("String were reverted. See 'STRINGS.txt'");
    }
}
