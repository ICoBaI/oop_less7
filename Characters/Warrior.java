package Characters;

import Wepons.Sword;

public class Warrior implements Char {
    private String name;
    private int health;
    private int armor;
    private Sword sword;

    public Warrior(String name, int health, int armor, Sword sword) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.sword = sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int getArmor() {
        return armor;
    }

}