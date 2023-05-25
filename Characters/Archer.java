package Characters;

import Wepons.Bow;

public class Archer implements Char{

    private String name;
    private int health;
    private int armor;
    private Bow bow;

    public Archer(String name, int health, int armor, Bow bow) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.bow = bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public Bow getBow() {
        return bow;
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
