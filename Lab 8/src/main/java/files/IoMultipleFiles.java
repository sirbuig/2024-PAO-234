package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IoMultipleFiles {

    public static void main(String[] args) {
        // typo here, test2.text, it created the file and wrote inside
        writeFiles("My_DIR/test2.text", "My_DIR/test3.txt");
    }

    private static void writeFiles(String fileName, String otherFileName) {
        Path path = Paths.get(fileName);
        Path otherPath = Paths.get(otherFileName);

        try (BufferedWriter writer = Files.newBufferedWriter(path);
            BufferedWriter otherWriter = Files.newBufferedWriter(otherPath, StandardOpenOption.APPEND)) {

            writer.write("Hello2");
            writer.newLine();
            writer.write("Hello");
            writer.newLine();

            otherWriter.write("Hello3");
            otherWriter.newLine();
            otherWriter.write("Hello again");
            otherWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
