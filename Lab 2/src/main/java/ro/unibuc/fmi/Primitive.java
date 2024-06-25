package ro.unibuc.fmi;

public class Primitive {
    public static void main(String[] args) {
        int thisVariableIsNice;

        final int CONSTANT_VALUE = 5;

        System.out.println(CONSTANT_VALUE);

        //CONSTANT_VALUE = 19;

        // comentarii pe o linie


        /*
        here are a lot of comments
        still more coments required
         */

        byte b = 32; // between -128 and 127
        System.out.println(b);

        boolean ok = true; // / false;
        System.out.println(ok);

        short c = 157; // between -2^15 to 2^15-1
        System.out.println(c);

        int d = 1000000; //between -2^31 to 2^31-1
        System.out.println(d);

        long e = 25L; // between -2^63 to 2^63-1
        System.out.println(e);

        float x = 32.5F;
        System.out.println(x);

        double y = 20.9;
        System.out.println(y);

        char ch = 's';
        System.out.println(ch);
    }
}
