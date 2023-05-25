package Characters;

import java.util.Scanner;

import Characters.CharStatRandom.ArcherStatR;
import Wepons.CreationWeapon;

public class CreationChar {
    

    public Archer getArcher() {
        Scanner sc = new Scanner(System.in);
        ArcherStatR archersStatR = new ArcherStatR();
        int health = archersStatR.health();
        int armor = archersStatR.armor();
        System.out.println("Введите имя лучника: ");
        String name = sc.nextLine();
        return new Archer(name, health, armor, new CreationWeapon().getBow());
    }

    public Warrior getWarrior() {
        Scanner sc = new Scanner(System.in);
        ArcherStatR archersStatR = new ArcherStatR();
        int health = archersStatR.health();
        int armor = archersStatR.armor();
        System.out.println("Введите имя война: ");
        String name = sc.nextLine();
        return new Warrior(name, health, armor, new CreationWeapon().getSword());

    }
}
