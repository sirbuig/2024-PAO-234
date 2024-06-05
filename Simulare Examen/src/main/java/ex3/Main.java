package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> files = List.of(
                "C:\\FMI\\PAO - 234\\SimulareExamen\\src\\main\\java\\ex3\\exemplu_1.txt",
                "C:\\FMI\\PAO - 234\\SimulareExamen\\src\\main\\java\\ex3\\exemplu_2.txt",
                "C:\\FMI\\PAO - 234\\SimulareExamen\\src\\main\\java\\ex3\\exemplu_3.txt"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter word to search: ");
        String wordSearched = scanner.next();

        List<FindWordInFile> countsRunnable = new ArrayList<>();
        for (String file : files)   {
            FindWordInFile fileCountingWords = new FindWordInFile(file, wordSearched);
            countsRunnable.add(fileCountingWords);
            Thread thread = new Thread(fileCountingWords);
            thread.start();
        }

        long sum = 0;
        for(FindWordInFile fileCountingWords : countsRunnable)   {
            while (fileCountingWords.getWordCounter().isEmpty())    {
                Thread.sleep(500);
            }
            System.out.println(fileCountingWords.getFilename() + " : " + fileCountingWords.getWordCounter().getAsLong());
            sum +=  fileCountingWords.getWordCounter().getAsLong();
        }

        System.out.println("Total number = " + sum);
    }
}
