package threads.ex3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> messages = Arrays.asList("Hello", "PAO", "Students", "!");

        //Sleeping thread
        for(String message : messages)  {
            Thread.sleep(2000);
            System.out.println(message);
        }

        for(String message : messages)  {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception)  {
                return;
            }
            System.out.println(message);
        }

        for(String message : messages)  {
            Thread.sleep(2000);
            System.out.println(message);
            if(Thread.interrupted())    {
                return;
            }
        }
    }
}
