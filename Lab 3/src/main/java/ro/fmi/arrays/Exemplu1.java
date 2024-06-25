package ro.fmi.arrays;

public class Exemplu1 {

    //psvm
    public static void main(String[] args) {
        // type[] nume
        // type nume[]

        int[] v1, v4;
        int[] v2;
        int[] v3;
        int v5;

        v1 = new int[10];
        int[] v6 = new int[20];
        int[] v7 = {1, 2, 3, 4, 5, 6};

        // v7[0] , v7[1], .... v7[5] = v7[v7.length-1]

        for (int i = 0; i < v7.length; i++) {
            System.out.println(v7[i] + " ");
        }
        System.out.println();
        System.out.println(v7.length);

        v7[2] = 19;
        //v7[15] = -1; // primim ArrayIndexOutOfBoundsException

        double[] x1 = new double[]{11, 12, 15, 26, 37.2, 19};
        double[] x2 = new double[]{};

        double sum = calculeazaSuma(x1);
        double sum2 = calculeazaSuma2(x1);
        //double sum3 = calculeazaSuma(123.45); // primeste eroare de compilare
        //double suma4 = calculeazaSuma2(123.45); // primeste eroare de compilare

        System.out.println(sum);
        System.out.println(sum2);
    }

    static double calculeazaSuma(double[] array) {
        double suma = 0;
        for (double i : array) {
            suma += i;
        }
        return suma;
    }

    static double calculeazaSuma2(double[] array) {
        double suma = 0;
        for (double i : array) {
            suma += i;
        }
        return suma;
    }
}
