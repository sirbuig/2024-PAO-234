package exceptions;

import java.io.IOException;

//IOException, SQLException
public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            doSomething();
            //doSomethingElse();
        } catch (IOException e) {
            //e.printStackTrace();
            //System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething() throws IOException {
        throw new IOException("problem");
    }

    public static void doSomethingElse() {
        throw new RuntimeException("problem");
    }
}
