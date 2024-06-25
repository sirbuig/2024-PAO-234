package ro.unibuc.fmi;

public class Main {
    public static void main(String[] args) {
        // can have values: true, false, null
        Boolean a = true;
        System.out.println("Boolean: " + a);

        // can have values between -128 and 127 and null
        Byte b = null;
        System.out.println("Null byte: " + b);

        Short c = 32;
        System.out.println("Short: " + c);

        Integer d = 129;
        System.out.println("Integer: " + d);

        Long e = 453L;
        System.out.println("Long: " + e);

        Float f = 15.23F;
        System.out.println("Float: " + f);

        Double g = 124.98;
        System.out.println("Double: " + g);

        Character ch = 'x';
        System.out.println("Character: " + ch);

        String str = "text";
        System.out.println(str);

        int q = 1_000_000;
        double w = 123_400.12;

        System.out.println(q + " " + w);

        Integer r = 3;
        Integer p = null;
//        System.out.println(p+r);
    }
}