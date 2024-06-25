package ro.unibuc.fmi;

import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        Scanner scanner;

        scanner = new Scanner(System.in);

//      let's read a boolean
        System.out.println("Read a boolean");
        boolean a = scanner.nextBoolean();
        System.out.println(a);

        System.out.println("Read a byte");
        byte b = scanner.nextByte();
        System.out.println("Read an int");
        int c = scanner.nextInt();
        System.out.println("Read a double");
        double d = scanner.nextDouble();

//      System.out.println("This reads everything after the double above");
        String text = scanner.nextLine();

//      default, when it doesn't have the type specified
        System.out.println("Read anything");
        String secondText = scanner.next();

        System.out.println("Read a long");
        long x = Long.parseLong(scanner.next());

        boolean boo = true;
        System.out.println("Read a boolean");
        if (scanner.hasNextBoolean()) {
            boo = scanner.nextBoolean();
        }

        System.out.println(boo + " " + text);

        System.out.print("output ");
        System.out.println("another output");
        System.out.println("this contains a \n \t character");

        System.err.print("it seems that...");
        System.err.println("Something bad happened!");
    }
}