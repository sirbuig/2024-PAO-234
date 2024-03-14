package ro.unibuc.fmi;

import java.util.Scanner;

public class Reading {

   public static void main(String args[]) {
       Scanner scanner;

       scanner = new Scanner(System.in);

       // let's read a boolean
       boolean a = scanner.nextBoolean();
       System.out.println(a);

       byte b = scanner.nextByte();
       int c = scanner.nextInt();
       double d = scanner.nextDouble();

       String text = scanner.nextLine();

        default, when it doesn't have the type specified
       String secondText = scanner.next();

       long x = Long.parseLong(scanner.next());

       boolean a = true;
       if (scanner.hasNextBoolean()) {
           a = scanner.nextBoolean();
       }

       System.out.println(a + "  " + text);

       System.out.print("output");
       System.out.println("another output");
       System.out.println("this contains an \n \t character");

       System.err.print ("it semms that...");
       System.err.println("Something bad happend!");
   }
}