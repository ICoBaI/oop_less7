package Wepons;

public class Bow implements Wep {

    private int damage;
    private String tipe;

    public Bow (int damage, String tipe){
        this.tipe = tipe;
        this.damage = damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getTipe() {
        return tipe;
    }

    @Override
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
}
