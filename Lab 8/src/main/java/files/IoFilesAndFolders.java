package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoFilesAndFolders {

    public static void main(String[] args) {
        try {
            //createFile("generateFile.txt");
            //createFolder("My_DIR");
//            createFile("My_DIR/test2.txt");
//            createFile("My_DIR/test3.txt");
            listContentFolder("My_DIR");
            // throws IOException, because at this time only folder B exists, and it cannot create more than
            //one folder at a time
            //createFolder("My_DIR/A/B/C/D");
            //createFile("My_DIR/A/B/test4.txt");
            deleteFile("generateFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.createFile(path);
    }

    private static void createFolder(String folderName) throws IOException {
        Path path = Paths.get(folderName);
        Files.createDirectory(path);
    }

    private static void listContentFolder(String folderName) throws IOException {
        Path path = Paths.get(folderName);
        Files.list(path).forEach(file -> {
            System.out.println(file);
        });
    }

    private static void deleteFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.delete(path);
    }
}
