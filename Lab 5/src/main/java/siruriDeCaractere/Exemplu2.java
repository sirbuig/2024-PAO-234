package siruriDeCaractere;

public class Exemplu2 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        char[] vowels = {'a','e','i', 'o', 'u'};

        for (char vowel: vowels) {
            result = result.append(vowel);
        }
        System.out.println(result);

        System.out.println(result);
        System.out.println(result.capacity());

        StringBuilder sb1 = new StringBuilder(25);
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2.capacity());
    }
}
