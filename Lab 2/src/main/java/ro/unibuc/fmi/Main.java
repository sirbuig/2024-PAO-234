package ro.unibuc.fmi;

public class Main {
    public static void main(String[] args) {
        // can have values: true, false, null
        Boolean a = true;
        System.out.println(a);

        // can have values between -128 and 127 and null
        Byte b = null;
        System.out.println(b);

        Short c=32;
        System.out.println(c);

        Integer d = 129;
        System.out.println(d);

        Long e = 453L;
        System.out.println(e);

        Float f = 15.23F;
        System.out.println(f);

        Double g = 124.98;
        System.out.println(g);

        Character ch = 'x';
        System.out.println(ch);

        String str = "text";
        System.out.println(str);

        int q = 1_000_000;
        double w = 123_400.12;

        System.out.println(q + " " + w);

        Integer r = 3;
        Integer p = null;

        System.out.println(p+r);
    }
}