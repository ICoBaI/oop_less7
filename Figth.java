import Characters.Archer;
import Characters.CreationChar;
import Characters.Warrior;

public class Figth {
    Archer archer;
    Warrior warrior;

    private Archer getArcher() {
        return this.archer = new CreationChar().getArcher();
    }

    private Warrior getWarrior() {
        return this.warrior = new CreationChar().getWarrior();
    }

    public void StartFigth() {
        getArcher();
        getWarrior();
        while (true) {
            System.out.println("Лучник: " + archer.getName() +
                    "\nHP: " + archer.getHealth() +
                    "\nAP: " + archer.getBow().getDamage() +
                    "\nArmor: " + archer.getArmor() +
                    "\n----------------------------------------");
            System.out.println("Воин: " + warrior.getName() +
                    "\nHP: " + warrior.getHealth() +
                    "\nAP: " + warrior.getSword().getDamage() +
                    "\nArmor: " + warrior.getArmor() +
                    "\n----------------------------------------");
            ;
            if (archer.getHealth() > 0) {
                if (archer.getBow().getDamage() > warrior.getArmor()) {
                    warrior.setHealth(warrior.getHealth() - (archer.getBow().getDamage() - warrior.getArmor()));
                } else {
                    warrior.setHealth(warrior.getHealth() - 10);
                    ;
                }
            } else {
                System.out.println("Воин вин");
                break;
            }
            if (warrior.getHealth() > 0) {
                if (warrior.getSword().getDamage() > archer.getArmor()) {
                    archer.setHealth(archer.getHealth() - (warrior.getSword().getDamage() - archer.getArmor()));
                } else {
                    archer.setHealth(archer.getHealth() - 10);
                }
            } else {
                System.out.println("Лук вин");
                break;
            }

        }
    }

}
