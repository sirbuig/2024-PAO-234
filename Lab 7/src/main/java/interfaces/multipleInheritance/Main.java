package interfaces.multipleInheritance;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.canFly();
        hero.canSwim();
        hero.canFight("enemy1");

        CanSwim swim = new Hero();
        swim.canSwim();

        CanFly fly = new Hero();
        fly.canFly();

        CanFight fight = new Hero();
        fight.canFight("enemy2");

        ActionCharacter actionCharacter = new Hero();
        actionCharacter.canFight("enemy3");
    }
}
