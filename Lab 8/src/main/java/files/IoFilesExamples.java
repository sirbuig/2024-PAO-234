package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IoFilesExamples {

    public static void main(String[] args) {
        String filePath = "myFirstFile.txt";
        //m1(filePath);

        String line = "Here is my new line added from code";
//        m2Write(filePath, line);
//        m2Read(filePath);

//        m3Write (filePath, line);
//        m3Read(filePath);

//        m4Write(filePath, line);
//        m4Read(filePath);

        m5Write(filePath, line);
        m5Read(filePath);
    }

    public static void m1(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m2Read(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int i;
            while (( i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // fluxuri primitive, prelucrare la nivel de caracter
    private static void m2Write(String filePath, String line) {
        int i;

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("\n\n");
            fileWriter.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m3Read(String filePath) {
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int i;
            while ((i = inputStream.read())!=-1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //prelucrarea are loc la nivel de octeti
    private static void m3Write(String filePath, String line) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write("\n".getBytes());
            outputStream.write(line.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m4Read(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //fluxuri de procesare -> buffers
    private static void m4Write(String filePath, String line) {
        // try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) -> face append la continutul deja existent al fisierului
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m5Read(String filePath) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            int i;
            while ((i = randomAccessFile.read())!= -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // fluxuri de procesare cu acces aleatoriu
    private static void m5Write(String filePath, String line) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            File file = new File(filePath);
            randomAccessFile.seek(file.length());
            randomAccessFile.write("\n".getBytes());
            randomAccessFile.write(line.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
