package asocieri.domain;

import java.util.Arrays;

public class Universitate {

    private final String nume;

    private final Departament[] departaments; // compozitia

    public Universitate(String nume, Departament[] departaments) {
        this.nume = nume;
        //this.departaments = departaments;
        this.departaments = Arrays.copyOf(departaments, departaments.length);
    }

    @Override
    public String toString() {
        return "Universitatea: nume = " + nume + ", departamente = " + Arrays.toString(departaments);
    }
}
