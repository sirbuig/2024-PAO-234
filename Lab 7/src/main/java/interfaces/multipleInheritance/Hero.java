package interfaces.multipleInheritance;

public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {
    @Override
    public void canFly() {
        System.out.println("fly");
    }

    @Override
    public void canSwim() {
        System.out.println("swim");
    }
}
