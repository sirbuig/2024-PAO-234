package ex2;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Automobil> automobile = List.of(
                new Automobil("Audi", "Q5", 2000, 50000),
                new Automobil("Dacia", "Logan", 1400, 20000),
                new Automobil("Toyota", "C-HR", 1800, 32000),
                new Automobil("Toyota", "Yaris", 1500, 24000),
                new Automobil("Lada","Carton", 500, 4200)
        );

        //afisati automobilele care costa cel putin 5000€, în ordinea descrescatoare a preturilor
        automobile.stream()
                .filter(a -> a.getPret() >= 5000)
                .sorted(Comparator.comparing(Automobil::getPret).reversed())
                .forEach(System.out::println);
        System.out.println();

        // marcile distincte de automobile
        automobile.stream()
                .map(a -> a.getMarca())
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        //creati o lista formata din automobilele care au capacitatea cilindrica cuprinsa între 2000 si 3000 cm3
        List<Automobil> secondList = automobile.stream()
                .filter(a -> a.getCapacitate() >= 2000 && a.getCapacitate() <= 5000)
                .toList();
        System.out.println();

        //afisati pretul maxim al unui automobil marca "Audi"
        Integer pretMaxim = secondList.stream()
                .filter(a -> a.getMarca().equals("Audi"))
                .max(Comparator.comparingInt(Automobil::getPret))
                .get()
                .getPret();
        System.out.println("Pretul maxim pentru un Audi este: "+ pretMaxim);
    }
}
