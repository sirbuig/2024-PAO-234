package asocieri;

import asocieri.domain.Departament;
import asocieri.domain.Profesor;
import asocieri.domain.Universitate;

public class Main {
    public static void main(String[] args) {
        Profesor[] profesoriInfo = {
                new Profesor(1, "Ionescu"),
                new Profesor(2, "Popescu"),
                new Profesor(3, "Georgescu")
        };

        Profesor[] profesoriMate = {
                new Profesor(1, "Ion"),
                new Profesor(2, "Popa"),
                new Profesor(3, "George")
        };

        Departament departamentInfo = new Departament("info", profesoriInfo);
        Departament departamentMate = new Departament("mate", profesoriMate);

        Universitate unibuc = new Universitate("unibuc", new Departament[] {departamentInfo, departamentMate});
        System.out.println(unibuc);
    }
}
